package com.demo.test.mymusic;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.zhy.adapter.recyclerview.MultiItemTypeAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * @author Administrator
 */
@Route(path = Config.Main)
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.list_content)
    RecyclerView listContent;
    MenuAdapter menuAdapter;
    List<String> items;
    @BindView(R.id.text_name)
    TextView textName;

    MusicBaseInfo musicBaseInfo;
    MediaPlayer mediaPlayer;
    PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
        init();
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            mediaPlayer.release();
        }
    }

    private void init() {
        items = new ArrayList<>();
        menuAdapter = new MenuAdapter(this, R.layout.menu_item_view, items);
        RecycleViewDivider recycleViewDivider = new RecycleViewDivider(this, LinearLayoutManager.VERTICAL, 10, Color.BLUE);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        listContent.addItemDecoration(recycleViewDivider);
        listContent.setLayoutManager(linearLayoutManager);
        listContent.setAdapter(menuAdapter);
        menuAdapter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {
                switch (position) {
                    case 0:
                        ARouter.getInstance().build(Config.Text).withSerializable("music", musicBaseInfo).navigation();
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(MainActivity.this, musicBaseInfo.getVoiceInfo().getVoiceRes());
                        mediaPlayer.start();
                        showVoiceInfo();
                        break;
                    case 2:
                        ARouter.getInstance().build(Config.WEB).withSerializable("music", musicBaseInfo).navigation();
                        break;
                    case 3:
                        ARouter.getInstance().build(Config.HELP).withSerializable("music", musicBaseInfo).navigation();
                        break;
                    default:
                        break;
                }
            }

            @Override
            public boolean onItemLongClick(View view, RecyclerView.ViewHolder holder, int position) {
                return false;
            }
        });

        musicBaseInfo = (MusicBaseInfo) getIntent().getSerializableExtra("music");
        textName.setText(musicBaseInfo.getName());
    }

    private void initData() {
        items.add("乐器介绍");
        items.add("试听");
        items.add("观看");
        items.add("帮助");
        menuAdapter.notifyDataSetChanged();
    }


    private void showVoiceInfo() {
        VoiceInfo voiceInfo = musicBaseInfo.getVoiceInfo();
        View root = LayoutInflater.from(this).inflate(R.layout.dialog_voice_info, null);
        TextView textView1 = root.findViewById(R.id.voice_name);
        TextView textView2 = root.findViewById(R.id.voice_author);
        textView1.setText("名称:" + voiceInfo.getName());
        textView2.setText("作者:" + voiceInfo.getAuthor());
        popupWindow = new PopupWindow(this);
        popupWindow.setContentView(root);
        popupWindow.setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        popupWindow.showAtLocation(listContent.getChildAt(0), Gravity.CENTER, 0, 0);
        root.findViewById(R.id.cancel_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
                popupWindow.dismiss();
            }
        });


    }

    @OnClick(R.id.back_btn)
    public void onViewClicked() {
        finish();
    }
}
