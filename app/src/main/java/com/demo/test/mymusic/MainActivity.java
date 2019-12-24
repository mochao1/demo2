package com.demo.test.mymusic;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.zhy.adapter.recyclerview.MultiItemTypeAdapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
        init();
        initData();
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
                        Toast.makeText(getApplicationContext(),"正在开发...",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(),"正在开发...",Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        ARouter.getInstance().build(Config.WEB).navigation();
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
}
