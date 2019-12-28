package com.demo.test.mymusic;

import java.io.Serializable;
import java.util.List;

/**
 * @author Messi.Mo
 * @date 2019/12/24
 * description:
 */

public class MusicBaseInfo implements Serializable {

    private String name;
    private int imageRes;
    private int infoRes;
    private String payUrl;
    private String videoUrl;
    private VoiceInfo voiceInfo;
    private List<TestInfo> testInfo;

    public MusicBaseInfo() {
    }

    public MusicBaseInfo(List<TestInfo> testInfo,VoiceInfo voiceInfo, String name, int imageRes, int infoRes, String videoUrl, String payUrl) {
        this.name = name;
        this.imageRes = imageRes;
        this.infoRes = infoRes;
        this.payUrl = payUrl;
        this.voiceInfo = voiceInfo;
        this.videoUrl = videoUrl;
        this.testInfo = testInfo;
    }

    public List<TestInfo> getTestInfo() {
        return testInfo;
    }

    public void setTestInfo(List<TestInfo> testInfo) {
        this.testInfo = testInfo;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public VoiceInfo getVoiceInfo() {
        return voiceInfo;
    }

    public void setVoiceInfo(VoiceInfo voiceInfo) {
        this.voiceInfo = voiceInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public int getInfoRes() {
        return infoRes;
    }

    public void setInfoRes(int infoRes) {
        this.infoRes = infoRes;
    }

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }
}
