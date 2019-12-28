package com.demo.test.mymusic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Messi.Mo
 * @date 2019/12/28
 * description:
 */

public class DataCenter {


    /**
     * @return 吉他
     */
    public static List<TestInfo> getjita(){
        List<TestInfo> testInfos=new ArrayList<>();
        List<String> options=new ArrayList<>();
        options.add("4");
        options.add("#4");
        options.add("6");
        options.add("#5");
        TestInfo testInfo=new TestInfo();
        testInfo.setCorrectValue("B");
        testInfo.setTitleName("D调里的3(mi)是基础C调里的什么音?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("4");
        options.add("#4");
        options.add("6");
        options.add("#5");
        testInfo.setCorrectValue("C");
        testInfo.setTitleName("E调里的4(fa)是基础C调里的什么音?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("4");
        options.add("#4");
        options.add("6");
        options.add("#5");
        testInfo.setCorrectValue("C");
        testInfo.setTitleName("F调里的3(mi)是基础C调里的什么音?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("4");
        options.add("#4");
        options.add("6");
        options.add("#5");
        testInfo.setCorrectValue("B");
        testInfo.setTitleName("E调里的2(re)是基础C调里的什么音?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("Em和弦");
        options.add("D和弦");
        options.add("Am和弦");
        options.add("A和弦");
        testInfo.setCorrectValue("AC");
        testInfo.setTitleName("Em D Am A这四个和弦中，哪个和弦不是大三和弦?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        return testInfos;
    }

    /**
     * @return 电子琴
     */
    public static List<TestInfo> getdianziqin(){
        List<TestInfo> testInfos=new ArrayList<>();
        List<String> options=new ArrayList<>();
        options.add("食/中/拇/食/中/无名指");
        options.add("中/食/拇/食/中/无名指");
        options.add("食/中/拇/中/食/无名指");
        options.add("无名指/食/中/拇/食/中");
        TestInfo testInfo=new TestInfo();
        testInfo.setCorrectValue("A");
        testInfo.setTitleName("把1234567弹完的话分别对应右手指?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("力度重触键");
        options.add("稍轻");
        options.add("过于轻松");
        options.add("轻飘飘");
        testInfo.setCorrectValue("B");
        testInfo.setTitleName("弹电子琴手指的力度?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("正确");
        options.add("错误");
        options.add("");
        options.add("");
        testInfo.setCorrectValue("A");
        testInfo.setTitleName("大拇指用外侧触键，其它指用指尖肉部触键?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("正确");
        options.add("错误");
        options.add("");
        options.add("");
        testInfo.setCorrectValue("A");
        testInfo.setTitleName("手指自然微微弯曲，最后一节与键盘垂直？");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        return testInfos;
    }


    /**
     * @return 笛子
     */
    public static List<TestInfo> getdizi(){
        List<TestInfo> testInfos=new ArrayList<>();
        List<String> options=new ArrayList<>();
        options.add("曲笛");
        options.add("梆笛");
        options.add("定调笛");
        options.add("中音笛");
        TestInfo testInfo=new TestInfo();
        testInfo.setCorrectValue("ABD");
        testInfo.setTitleName("笛子从音高分类哪几种？");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("短笛");
        options.add("长笛");
        options.add("风笛");
        options.add("直笛");
        testInfo.setCorrectValue("ABCD");
        testInfo.setTitleName("西洋管乐器中，笛可以分为哪几种？");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("正确");
        options.add("错误");
        options.add("");
        options.add("");
        testInfo.setCorrectValue("A");
        testInfo.setTitleName("笛子起源于中国？");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        return testInfos;
    }

    /**
     * @return 二胡
     */
    public static List<TestInfo> geterhu(){
        List<TestInfo> testInfos=new ArrayList<>();
        List<String> options=new ArrayList<>();
        options.add("唐朝");
        options.add("宋朝");
        options.add("元朝");
        options.add("明朝");
        TestInfo testInfo=new TestInfo();
        testInfo.setCorrectValue("A");
        testInfo.setTitleName("二胡起源那个朝代?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);
        return testInfos;
    }

    /**
     * @return 钢琴
     */
    public static List<TestInfo> getgangqin(){
        List<TestInfo> testInfos=new ArrayList<>();
        List<String> options=new ArrayList<>();
        options.add("正确");
        options.add("错误");
        options.add("");
        options.add("");
        TestInfo testInfo=new TestInfo();
        testInfo.setCorrectValue("A");
        testInfo.setTitleName("钢琴被誉为“乐器之王”的美称?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("50白 38黑");
        options.add("51白 37黑");
        options.add("52白 36黑");
        options.add("53白 35黑");
        testInfo.setCorrectValue("C");
        testInfo.setTitleName("钢琴黑白键的数量分配？");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("1700");
        options.add("1709");
        options.add("1800");
        options.add("1809");
        testInfo.setCorrectValue("B");
        testInfo.setTitleName("钢琴发明时间？");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        return testInfos;
    }

    /**
     * @return 中国鼓
     */
    public static List<TestInfo> getzhongguogu(){
        List<TestInfo> testInfos=new ArrayList<>();
        List<String> options=new ArrayList<>();
        options.add("");
        options.add("");
        options.add("");
        options.add("");
        TestInfo testInfo=new TestInfo();
        testInfo.setCorrectValue("B");
        testInfo.setTitleName("?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("");
        options.add("");
        options.add("");
        options.add("");
        testInfo.setCorrectValue("C");
        testInfo.setTitleName("");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("");
        options.add("");
        options.add("");
        options.add("");
        testInfo.setCorrectValue("C");
        testInfo.setTitleName("");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("");
        options.add("");
        options.add("");
        options.add("");
        testInfo.setCorrectValue("B");
        testInfo.setTitleName("");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("");
        options.add("");
        options.add("");
        options.add("");
        testInfo.setCorrectValue("");
        testInfo.setTitleName("");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        return new ArrayList<>();
    }

    /**
     * @return 架子鼓
     */
    public static List<TestInfo> getjiazigu(){
        List<TestInfo> testInfos=new ArrayList<>();
        List<String> options=new ArrayList<>();
        options.add("法国");
        options.add("德国");
        options.add("美国");
        options.add("英国");
        TestInfo testInfo=new TestInfo();
        testInfo.setCorrectValue("C");
        testInfo.setTitleName("架子鼓起源于哪个国家?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("正确");
        options.add("错误");
        options.add("");
        options.add("");
        testInfo.setCorrectValue("A");
        testInfo.setTitleName("架子鼓由低音大鼓、踩镲、军鼓、嗵鼓、镲片所组成?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("汗水");
        options.add("清水");
        options.add("啤酒");
        options.add("");
        testInfo.setCorrectValue("ABC");
        testInfo.setTitleName("哪些液体能够缩短架子鼓的寿命?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        return testInfos;
    }

    /**
     * @return 萨克斯
     */
    public static List<TestInfo> getsakesi(){
        List<TestInfo> testInfos=new ArrayList<>();
        List<String> options=new ArrayList<>();
        options.add("查理·帕克");
        options.add("阿尔法·萨克斯");
        options.add("阿道夫·萨克斯");
        options.add("肯尼·基");
        TestInfo testInfo=new TestInfo();
        testInfo.setCorrectValue("C");
        testInfo.setTitleName("萨克斯由谁发明?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("1838");
        options.add("1840");
        options.add("1842");
        options.add("1850");
        testInfo.setCorrectValue("C");
        testInfo.setTitleName("萨克斯发明时间?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("胸式呼吸法");
        options.add("腹式呼吸法");
        options.add("胸腹联合式呼吸法");
        options.add("");
        testInfo.setCorrectValue("ABC");
        testInfo.setTitleName("吹奏萨克斯的呼吸法有哪些？");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("正确");
        options.add("错误");
        options.add("");
        options.add("");
        testInfo.setCorrectValue("A");
        testInfo.setTitleName("古典萨克斯以中音萨克斯为主？");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        return testInfos;
    }

    /**
     * @return 小提琴
     */
    public static List<TestInfo> getxiaotiqin(){
        List<TestInfo> testInfos=new ArrayList<>();
        List<String> options=new ArrayList<>();
        options.add("3");
        options.add("4");
        options.add("5");
        options.add("6");
        TestInfo testInfo=new TestInfo();
        testInfo.setCorrectValue("B");
        testInfo.setTitleName("小提琴一共几根弦?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("正确");
        options.add("错误");
        options.add("");
        options.add("");
        testInfo.setCorrectValue("A");
        testInfo.setTitleName("小提琴分电子小提琴和木琴?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        options.clear();
        options.add("正确");
        options.add("错误");
        options.add("");
        options.add("");
        testInfo.setCorrectValue("B");
        testInfo.setTitleName("在不拉小提琴的时候，一定要把琴弓紧绷?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        return testInfos;
    }
}
