package com.demo.test.mymusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


@Route(path = Config.WEB)
public class WebActivity extends AppCompatActivity {

    @BindView(R.id.webView)
    WebView webView;
    MusicBaseInfo musicBaseInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        musicBaseInfo = (MusicBaseInfo) getIntent().getSerializableExtra("music");
        if (TextUtils.isEmpty(musicBaseInfo.getVideoUrl())) {
            Toast.makeText(this, "暂无视频资料", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            webView.loadUrl(musicBaseInfo.getVideoUrl());
        }
//        webView.setWebViewClient(new WebViewClient(){
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                view.loadUrl(url);
//                return true;
//            }
//        });
    }

    @OnClick(R.id.back_btn)
    public void onViewClicked() {
        finish();
    }
}
