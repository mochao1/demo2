package com.demo.test.mymusic;

import android.graphics.Color;
import android.os.Bundle;
import android.speech.tts.Voice;
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
        VoiceInfo voiceInfo1=new VoiceInfo(R.raw.lishenmao_sunflower,"sunflower","李森茂");
        musicBaseInfos.add(new MusicBaseInfo(voiceInfo1,"吉他", R.mipmap.jita,R.string.jita_text,"http:/www.baidu.com"));
        VoiceInfo voiceInfo2=new VoiceInfo(R.raw.dianziqin_sht_sat,"上海滩","SAT轻音乐团");
        musicBaseInfos.add(new MusicBaseInfo(voiceInfo2,"电子琴", R.mipmap.dianziqin,R.string.dianziqin,"http:/www.baidu.com"));
        VoiceInfo voiceInfo3=new VoiceInfo(R.raw.dizi_mdzs_hh,"花火","草木 魔道祖师");
        musicBaseInfos.add(new MusicBaseInfo(voiceInfo3,"笛子", R.mipmap.dizi,R.string.dizi,"http:/www.baidu.com"));
        VoiceInfo voiceInfo4=new VoiceInfo(R.raw.erhu_ab_eqyy,"二泉映月","阿炳");
        musicBaseInfos.add(new MusicBaseInfo(voiceInfo4,"二胡", R.mipmap.erhu,R.string.erhu,"http:/www.baidu.com"));
        VoiceInfo voiceInfo5=new VoiceInfo(R.raw.gangqin_zhy_ysgqq,"时间都去哪了","赵海洋");
        musicBaseInfos.add(new MusicBaseInfo(voiceInfo5,"钢琴", R.mipmap.gangqin,R.string.gangqing,"http:/www.baidu.com"));
        VoiceInfo voiceInfo6=new VoiceInfo(R.raw.gu_qx_lhdg,"气","群星");
        musicBaseInfos.add(new MusicBaseInfo(voiceInfo6,"中国鼓", R.mipmap.gu,R.string.gu,"http:/www.baidu.com"));
        VoiceInfo voiceInfo7=new VoiceInfo(R.raw.jiazigu_ctznl_rxg,"春天在哪里","任小果");
        musicBaseInfos.add(new MusicBaseInfo(voiceInfo7,"架子鼓", R.mipmap.jiazigu,R.string.jiazigu,"http:/www.baidu.com"));
        VoiceInfo voiceInfo8=new VoiceInfo(R.raw.sakesi_hj_kg,"回家","Kenny G");
        musicBaseInfos.add(new MusicBaseInfo(voiceInfo8,"萨克斯", R.mipmap.sakesi,R.string.sakesi,"http:/www.baidu.com"));
        VoiceInfo voiceInfo9=new VoiceInfo(R.raw.xiaotiqin_fd_xyq,"爱的梦","Frantisek Drdla");
        musicBaseInfos.add(new MusicBaseInfo(voiceInfo9,"小提琴", R.mipmap.xiaotiqin,R.string.xiaotiqin,"http:/www.baidu.com"));
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
