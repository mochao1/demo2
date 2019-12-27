package com.demo.test.mymusic;

import java.io.Serializable;

/**
 * @author Messi.Mo
 * @date 2019/12/24
 * description:
 */

public class MusicBaseInfo implements Serializable{

    private String name;
    private int imageRes;
    private int infoRes;
    private String payUrl;
    private VoiceInfo voiceInfo;

    public MusicBaseInfo() {
    }

    public MusicBaseInfo(VoiceInfo voiceInfo,String name, int imageRes, int infoRes,String payUrl) {
        this.name = name;
        this.imageRes = imageRes;
        this.infoRes = infoRes;
        this.payUrl = payUrl;
        this.voiceInfo=voiceInfo;
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
