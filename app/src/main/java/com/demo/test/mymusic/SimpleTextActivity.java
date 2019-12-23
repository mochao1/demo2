package com.demo.test.mymusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ihongqiqu.util.ToastsUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@Route(path = Config.Text)
public class SimpleTextActivity extends AppCompatActivity {

    @BindView(R.id.content_text)
    TextView contentText;

    @Autowired(name = "key")
    String  contentType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_text);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
        initData();
    }

    private void initData() {

    }

    @OnClick(R.id.back_btn)
    public void onViewClicked() {
        finish();
    }
}
