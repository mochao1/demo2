package com.demo.test.mymusic;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import com.alibaba.android.arouter.facade.annotation.Route;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@Route(path = Config.VIDEO)
public class VideoActivity extends AppCompatActivity {

    @BindView(R.id.videoView)
    VideoView videoView;
    @BindView(R.id.loading_view)
    ImageView loadingView;
    ObjectAnimator objectAnimator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        ButterKnife.bind(this);
        showAnimation();
        initData();
    }

    private void initData() {
        videoView.setVideoPath("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");
        videoView.start();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                objectAnimator.cancel();
                loadingView.setVisibility(View.GONE);
            }
        });
    }

    private void showAnimation() {
        objectAnimator = ObjectAnimator.ofFloat(loadingView,"rotation",360f);
        objectAnimator.setDuration(1000);
        objectAnimator.setRepeatCount(100);
        objectAnimator.start();
    }

    @OnClick(R.id.back_btn)
    public void onViewClicked() {
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (videoView != null) {
            videoView.pause();
            videoView.suspend();
        }
    }
}
