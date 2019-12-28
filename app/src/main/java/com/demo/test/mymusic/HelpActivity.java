package com.demo.test.mymusic;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@Route(path = Config.HELP)
public class HelpActivity extends AppCompatActivity {

    @BindView(R.id.pay_url_info)
    TextView payUrlInfo;

    MusicBaseInfo musicBaseInfo;
    @BindView(R.id.list_tests)
    RecyclerView listTests;
    TestAdapter testAdapter;
    List<TestInfo> testInfos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        ButterKnife.bind(this);
        musicBaseInfo = (MusicBaseInfo) getIntent().getSerializableExtra("music");
        payUrlInfo.setText("购买链接:" + musicBaseInfo.getPayUrl());
        initData();
    }

    private void initData() {
        testInfos = new ArrayList<>();
        testInfos.addAll(musicBaseInfo.getTestInfo());
        testAdapter = new TestAdapter(this, R.layout.test_item_view, testInfos);
        RecycleViewDivider recycleViewDivider = new RecycleViewDivider(this, LinearLayoutManager.VERTICAL, 10, Color.TRANSPARENT);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        listTests.addItemDecoration(recycleViewDivider);
        listTests.setLayoutManager(linearLayoutManager);
        listTests.setAdapter(testAdapter);
    }

    @OnClick({R.id.back_btn, R.id.btn_copy})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back_btn:
                finish();
                break;
            case R.id.btn_copy:
                //获取剪贴板管理器：
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                // 创建普通字符型ClipData
                ClipData mClipData = ClipData.newPlainText("Label", musicBaseInfo.getPayUrl());
                // 将ClipData内容放到系统剪贴板里。
                cm.setPrimaryClip(mClipData);
                break;
            default:
                break;
        }
    }
}
