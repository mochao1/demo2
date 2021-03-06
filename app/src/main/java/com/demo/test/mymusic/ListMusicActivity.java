package com.demo.test.mymusic;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

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
        VoiceInfo voiceInfo1=new VoiceInfo(R.raw.pipa_ppq_unknow,"琵琶曲","未知-纯音乐");
        List<TestInfo> testInfo1=DataCenter.getpipa();
        musicBaseInfos.add(new MusicBaseInfo(testInfo1,voiceInfo1,"琵琶",R.mipmap.pipa,R.string.pipa,"https://www.iqiyi.com/v_19rr7dwz0c.html",""));
        VoiceInfo voiceInfo2=new VoiceInfo(R.raw.guzheng_gsls_yqx,"高山流水","于秋璇");
        List<TestInfo> testInfo2=DataCenter.getguzheng();
        musicBaseInfos.add(new MusicBaseInfo(testInfo2,voiceInfo2,"古筝",R.mipmap.guzheng,R.string.guzheng,"https://www.iqiyi.com/v_19rr7edups.html",""));
        //VoiceInfo voiceInfo1=new VoiceInfo(R.raw.lishenmao_sunflower,"sunflower","李森茂");
        //List<TestInfo> testInfo1=DataCenter.getjita();
        //musicBaseInfos.add(new MusicBaseInfo(testInfo1,voiceInfo1,"吉他", R.mipmap.jita,R.string.jita_text,"http://www.iqiyi.com/v_19rromes0s.html","https://item.jd.com/10026583671.html"));
        //VoiceInfo voiceInfo2=new VoiceInfo(R.raw.dianziqin_sht_sat,"上海滩","SAT轻音乐团");
        //List<TestInfo> testInfo2=DataCenter.getdianziqin();
        //musicBaseInfos.add(new MusicBaseInfo(testInfo2,voiceInfo2,"电子琴", R.mipmap.dianziqin,R.string.dianziqin,"https://www.iqiyi.com/v_19ruphuyzs.html","https://item.jd.com/7551156.html"));
        VoiceInfo voiceInfo3=new VoiceInfo(R.raw.dizi_mdzs_hh,"花火","草木 魔道祖师");
        List<TestInfo> testInfo3=DataCenter.getdizi();
        musicBaseInfos.add(new MusicBaseInfo(testInfo3,voiceInfo3,"笛子", R.mipmap.dizi,R.string.dizi,"http://www.iqiyi.com/v_19rrnq9xuo.html","https://item.jd.com/100006264738.html"));
        VoiceInfo voiceInfo4=new VoiceInfo(R.raw.erhu_ab_eqyy,"二泉映月","阿炳");
        List<TestInfo> testInfo4=DataCenter.geterhu();
        musicBaseInfos.add(new MusicBaseInfo(testInfo4,voiceInfo4,"二胡", R.mipmap.erhu,R.string.erhu,"http://www.iqiyi.com/v_19rrnq33es.html","https://item.jd.com/3658369.html"));
        VoiceInfo voiceInfo5=new VoiceInfo(R.raw.gangqin_zhy_ysgqq,"时间都去哪了","赵海洋");
        List<TestInfo> testInfo5=DataCenter.getgangqin();
        musicBaseInfos.add(new MusicBaseInfo(testInfo5,voiceInfo5,"钢琴", R.mipmap.gangqin,R.string.gangqing,"http://v.youku.com/v_show/id_XMTM5MTM1ODk1Mg==.html","https://item.jd.com/1461703688.html"));
        VoiceInfo voiceInfo6=new VoiceInfo(R.raw.gu_qx_lhdg,"气","群星");
        List<TestInfo> testInfo6=DataCenter.getzhongguogu();
        musicBaseInfos.add(new MusicBaseInfo(testInfo6,voiceInfo6,"中国鼓", R.mipmap.gu,R.string.gu,"","https://item.jd.com/25385471479.html"));
        //VoiceInfo voiceInfo7=new VoiceInfo(R.raw.jiazigu_ctznl_rxg,"春天在哪里","任小果");
        //List<TestInfo> testInfo7=DataCenter.getjiazigu();
        //musicBaseInfos.add(new MusicBaseInfo(testInfo7,voiceInfo7,"架子鼓", R.mipmap.jiazigu,R.string.jiazigu,"http://www.iqiyi.com/v_19rrk91bxc.html","https://item.jd.com/1109105223.html"));
        //VoiceInfo voiceInfo8=new VoiceInfo(R.raw.sakesi_hj_kg,"回家","Kenny G");
        //List<TestInfo> testInfo8=DataCenter.getsakesi();
        //musicBaseInfos.add(new MusicBaseInfo(testInfo8,voiceInfo8,"萨克斯", R.mipmap.sakesi,R.string.sakesi,"https://www.iqiyi.com/v_19rr9azdcc.html","https://item.jd.com/1059595415.html"));
        VoiceInfo voiceInfo9=new VoiceInfo(R.raw.xiaotiqin_fd_xyq,"爱的梦","Frantisek Drdla");
        List<TestInfo> testInfo9=DataCenter.getxiaotiqin();
        musicBaseInfos.add(new MusicBaseInfo(testInfo9,voiceInfo9,"小提琴", R.mipmap.xiaotiqin,R.string.xiaotiqin,"http://www.iqiyi.com/w_19rtnha32x.html?list=19rrlcgebi","https://item.jd.com/100002197280.html"));
        VoiceInfo voiceInfo10=new VoiceInfo(R.raw.xiao_unknow_yqw,"纯音乐","余其伟");
        List<TestInfo> testInfo10=DataCenter.getxiao();
        musicBaseInfos.add(new MusicBaseInfo(testInfo10,voiceInfo10,"箫",R.mipmap.xiao,R.string.xiao,"https://www.iqiyi.com/v_19rr4wpa40.html",""));
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
