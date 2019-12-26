package com.demo.test.mymusic;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.zhy.adapter.recyclerview.MultiItemTypeAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

@Route(path = Config.MUSICLIST)
public class ListMusicActivity extends AppCompatActivity {

    @BindView(R.id.list_music)
    RecyclerView listMusic;
    MusicBaseAdapter musicBaseAdapter;
    List<MusicBaseInfo> musicBaseInfos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_music);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
        init();
        initData();
    }

    private void initData() {
        musicBaseInfos.add(new MusicBaseInfo("吉他", R.mipmap.jita,R.string.jita_text,"http:/www.baidu.com"));
        musicBaseInfos.add(new MusicBaseInfo("电子琴", R.mipmap.dianziqin,R.string.dianziqin,"http:/www.baidu.com"));
        musicBaseInfos.add(new MusicBaseInfo("笛子", R.mipmap.dizi,R.string.dizi,"http:/www.baidu.com"));
        musicBaseInfos.add(new MusicBaseInfo("二胡", R.mipmap.erhu,R.string.erhu,"http:/www.baidu.com"));
        musicBaseInfos.add(new MusicBaseInfo("钢琴", R.mipmap.gangqin,R.string.gangqing,"http:/www.baidu.com"));
        musicBaseInfos.add(new MusicBaseInfo("中国鼓", R.mipmap.gu,R.string.gu,"http:/www.baidu.com"));
        musicBaseInfos.add(new MusicBaseInfo("架子鼓", R.mipmap.jiazigu,R.string.jiazigu,"http:/www.baidu.com"));
        musicBaseInfos.add(new MusicBaseInfo("萨克斯", R.mipmap.sakesi,R.string.sakesi,"http:/www.baidu.com"));
        musicBaseInfos.add(new MusicBaseInfo("小提琴", R.mipmap.xiaotiqin,R.string.xiaotiqin,"http:/www.baidu.com"));
        musicBaseAdapter.notifyDataSetChanged();
    }

    private void init() {
        musicBaseInfos = new ArrayList<>();
        musicBaseAdapter = new MusicBaseAdapter(this, R.layout.music_item_view, musicBaseInfos);
        RecycleViewDivider recycleViewDivider = new RecycleViewDivider(this, LinearLayoutManager.VERTICAL, 10, Color.BLUE);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        listMusic.addItemDecoration(recycleViewDivider);
        listMusic.setLayoutManager(linearLayoutManager);
        listMusic.setAdapter(musicBaseAdapter);
        musicBaseAdapter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {
                ARouter.getInstance().build(Config.Main).withSerializable("music", musicBaseInfos.get(position)).navigation();
            }

            @Override
            public boolean onItemLongClick(View view, RecyclerView.ViewHolder holder, int position) {
                return false;
            }
        });
    }
}
