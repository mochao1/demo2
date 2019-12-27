package com.demo.test.mymusic;

import java.io.Serializable;

/**
 * @author Messi.Mo
 * @date 2019/12/27
 * description:
 */

public class VoiceInfo implements Serializable{
    private int voiceRes;
    private String name;
    private String author;

    public VoiceInfo(int voiceRes, String name, String author) {
        this.voiceRes = voiceRes;
        this.name = name;
        this.author = author;
    }

    public int getVoiceRes() {
        return voiceRes;
    }

    public void setVoiceRes(int voiceRes) {
        this.voiceRes = voiceRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
