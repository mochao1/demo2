package com.demo.test.mymusic;

import java.io.Serializable;
import java.util.List;

/**
 * @author Messi.Mo
 * @date 2019/12/28
 * description:
 */

public class TestInfo implements Serializable{
    private String titleName;
    private List<String> options;
    private String correctValue;

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getCorrectValue() {
        return correctValue;
    }

    public void setCorrectValue(String correctValue) {
        this.correctValue = correctValue;
    }
}
