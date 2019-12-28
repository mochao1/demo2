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
    public static List<TestInfo> getjita() {
        List<TestInfo> testInfos = new ArrayList<>();
        List<String> options = new ArrayList<>();
        options.add("4");
        options.add("#4");
        options.add("6");
        options.add("#5");
        TestInfo testInfo = new TestInfo();
        testInfo.setCorrectValue("B");
        testInfo.setTitleName("D调里的3(mi)是基础C调里的什么音?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        TestInfo testInfo2 = new TestInfo();
        List<String> options2 = new ArrayList<>();
        options2.add("4");
        options2.add("#4");
        options2.add("6");
        options2.add("#5");
        testInfo2.setCorrectValue("C");
        testInfo2.setTitleName("E调里的4(fa)是基础C调里的什么音?");
        testInfo2.setOptions(options2);
        testInfos.add(testInfo2);

        TestInfo testInfo3 = new TestInfo();
        List<String> options3 = new ArrayList<>();
        options3.add("4");
        options3.add("#4");
        options3.add("6");
        options3.add("#5");
        testInfo3.setCorrectValue("C");
        testInfo3.setTitleName("F调里的3(mi)是基础C调里的什么音?");
        testInfo3.setOptions(options3);
        testInfos.add(testInfo3);

        TestInfo testInfo4 = new TestInfo();
        List<String> options4 = new ArrayList<>();
        options4.clear();
        options4.add("4");
        options4.add("#4");
        options4.add("6");
        options4.add("#5");
        testInfo4.setCorrectValue("B");
        testInfo4.setTitleName("E调里的2(re)是基础C调里的什么音?");
        testInfo4.setOptions(options4);
        testInfos.add(testInfo4);

        TestInfo testInfo5 = new TestInfo();
        List<String> options5 = new ArrayList<>();
        options5.add("Em和弦");
        options5.add("D和弦");
        options5.add("Am和弦");
        options5.add("A和弦");
        testInfo5.setCorrectValue("AC");
        testInfo5.setTitleName("Em D Am A这四个和弦中，哪个和弦不是大三和弦?");
        testInfo5.setOptions(options5);
        testInfos.add(testInfo5);

        return testInfos;
    }

    /**
     * @return 电子琴
     */
    public static List<TestInfo> getdianziqin() {
        List<TestInfo> testInfos = new ArrayList<>();
        List<String> options = new ArrayList<>();
        options.add("食/中/拇/食/中/无名指");
        options.add("中/食/拇/食/中/无名指");
        options.add("食/中/拇/中/食/无名指");
        options.add("无名指/食/中/拇/食/中");
        TestInfo testInfo = new TestInfo();
        testInfo.setCorrectValue("A");
        testInfo.setTitleName("把1234567弹完的话分别对应右手指?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        TestInfo testInfo2 = new TestInfo();
        List<String> options2 = new ArrayList<>();
        options2.add("力度重触键");
        options2.add("稍轻");
        options2.add("过于轻松");
        options2.add("轻飘飘");
        testInfo2.setCorrectValue("B");
        testInfo2.setTitleName("弹电子琴手指的力度?");
        testInfo2.setOptions(options2);
        testInfos.add(testInfo2);

        TestInfo testInfo3 = new TestInfo();
        List<String> options3 = new ArrayList<>();
        options3.add("正确");
        options3.add("错误");
        options3.add("");
        options3.add("");
        testInfo3.setCorrectValue("A");
        testInfo3.setTitleName("大拇指用外侧触键，其它指用指尖肉部触键?");
        testInfo3.setOptions(options3);
        testInfos.add(testInfo3);

        TestInfo testInfo4 = new TestInfo();
        List<String> options4 = new ArrayList<>();
        options4.add("正确");
        options4.add("错误");
        options4.add("");
        options4.add("");
        testInfo4.setCorrectValue("A");
        testInfo4.setTitleName("手指自然微微弯曲，最后一节与键盘垂直？");
        testInfo4.setOptions(options4);
        testInfos.add(testInfo4);

        return testInfos;
    }


    /**
     * @return 笛子
     */
    public static List<TestInfo> getdizi() {
        List<TestInfo> testInfos = new ArrayList<>();
        List<String> options = new ArrayList<>();
        options.add("曲笛");
        options.add("梆笛");
        options.add("定调笛");
        options.add("中音笛");
        TestInfo testInfo = new TestInfo();
        testInfo.setCorrectValue("ABD");
        testInfo.setTitleName("笛子从音高分类哪几种？");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        TestInfo testInfo2 = new TestInfo();
        List<String> options2 = new ArrayList<>();
        options2.add("短笛");
        options2.add("长笛");
        options2.add("风笛");
        options2.add("直笛");
        testInfo2.setCorrectValue("ABCD");
        testInfo2.setTitleName("西洋管乐器中，笛可以分为哪几种？");
        testInfo2.setOptions(options2);
        testInfos.add(testInfo2);

        TestInfo testInfo3 = new TestInfo();
        List<String> options3 = new ArrayList<>();
        options3.add("正确");
        options3.add("错误");
        options3.add("");
        options3.add("");
        testInfo3.setCorrectValue("A");
        testInfo3.setTitleName("笛子起源于中国？");
        testInfo3.setOptions(options3);
        testInfos.add(testInfo3);

        return testInfos;
    }

    /**
     * @return 二胡
     */
    public static List<TestInfo> geterhu() {
        List<TestInfo> testInfos = new ArrayList<>();
        List<String> options = new ArrayList<>();
        options.add("唐朝");
        options.add("宋朝");
        options.add("元朝");
        options.add("明朝");
        TestInfo testInfo = new TestInfo();
        testInfo.setCorrectValue("A");
        testInfo.setTitleName("二胡起源那个朝代?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);
        return testInfos;
    }

    /**
     * @return 钢琴
     */
    public static List<TestInfo> getgangqin() {
        List<TestInfo> testInfos = new ArrayList<>();
        List<String> options = new ArrayList<>();
        options.add("正确");
        options.add("错误");
        options.add("");
        options.add("");
        TestInfo testInfo = new TestInfo();
        testInfo.setCorrectValue("A");
        testInfo.setTitleName("钢琴被誉为“乐器之王”的美称?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        TestInfo testInfo2 = new TestInfo();
        List<String> options2 = new ArrayList<>();
        options2.add("50白 38黑");
        options2.add("51白 37黑");
        options2.add("52白 36黑");
        options2.add("53白 35黑");
        testInfo2.setCorrectValue("C");
        testInfo2.setTitleName("钢琴黑白键的数量分配？");
        testInfo2.setOptions(options2);
        testInfos.add(testInfo2);

        TestInfo testInfo3 = new TestInfo();
        List<String> options3 = new ArrayList<>();
        options3.add("1700");
        options3.add("1709");
        options3.add("1800");
        options3.add("1809");
        testInfo3.setCorrectValue("B");
        testInfo3.setTitleName("钢琴发明时间？");
        testInfo3.setOptions(options3);
        testInfos.add(testInfo3);

        return testInfos;
    }

    /**
     * @return 中国鼓
     */
    public static List<TestInfo> getzhongguogu() {
        List<TestInfo> testInfos = new ArrayList<>();
        List<String> options = new ArrayList<>();
        options.add("");
        options.add("");
        options.add("");
        options.add("");
        TestInfo testInfo = new TestInfo();
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
    public static List<TestInfo> getjiazigu() {
        List<TestInfo> testInfos = new ArrayList<>();
        List<String> options = new ArrayList<>();
        options.add("法国");
        options.add("德国");
        options.add("美国");
        options.add("英国");
        TestInfo testInfo = new TestInfo();
        testInfo.setCorrectValue("C");
        testInfo.setTitleName("架子鼓起源于哪个国家?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        TestInfo testInfo2 = new TestInfo();
        List<String> options2 = new ArrayList<>();
        options2.add("正确");
        options2.add("错误");
        options2.add("");
        options2.add("");
        testInfo2.setCorrectValue("A");
        testInfo2.setTitleName("架子鼓由低音大鼓、踩镲、军鼓、嗵鼓、镲片所组成?");
        testInfo2.setOptions(options2);
        testInfos.add(testInfo2);

        TestInfo testInfo3 = new TestInfo();
        List<String> options3 = new ArrayList<>();
        options3.add("汗水");
        options3.add("清水");
        options3.add("啤酒");
        options3.add("");
        testInfo3.setCorrectValue("ABC");
        testInfo3.setTitleName("哪些液体能够缩短架子鼓的寿命?");
        testInfo3.setOptions(options3);
        testInfos.add(testInfo3);

        return testInfos;
    }

    /**
     * @return 萨克斯
     */
    public static List<TestInfo> getsakesi() {
        List<TestInfo> testInfos = new ArrayList<>();
        List<String> options = new ArrayList<>();
        options.add("查理·帕克");
        options.add("阿尔法·萨克斯");
        options.add("阿道夫·萨克斯");
        options.add("肯尼·基");
        TestInfo testInfo = new TestInfo();
        testInfo.setCorrectValue("C");
        testInfo.setTitleName("萨克斯由谁发明?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        TestInfo testInfo2 = new TestInfo();
        List<String> options2 = new ArrayList<>();
        options2.add("1838");
        options2.add("1840");
        options2.add("1842");
        options2.add("1850");
        testInfo2.setCorrectValue("C");
        testInfo2.setTitleName("萨克斯发明时间?");
        testInfo2.setOptions(options2);
        testInfos.add(testInfo2);

        TestInfo testInfo3 = new TestInfo();
        List<String> options3 = new ArrayList<>();
        options3.add("胸式呼吸法");
        options3.add("腹式呼吸法");
        options3.add("胸腹联合式呼吸法");
        options3.add("");
        testInfo3.setCorrectValue("ABC");
        testInfo3.setTitleName("吹奏萨克斯的呼吸法有哪些？");
        testInfo3.setOptions(options3);
        testInfos.add(testInfo3);

        TestInfo testInfo4 = new TestInfo();
        List<String> options4 = new ArrayList<>();
        options4.add("正确");
        options4.add("错误");
        options4.add("");
        options4.add("");
        testInfo4.setCorrectValue("A");
        testInfo4.setTitleName("古典萨克斯以中音萨克斯为主？");
        testInfo4.setOptions(options4);
        testInfos.add(testInfo4);

        return testInfos;
    }

    /**
     * @return 小提琴
     */
    public static List<TestInfo> getxiaotiqin() {
        List<TestInfo> testInfos = new ArrayList<>();
        List<String> options = new ArrayList<>();
        options.add("3");
        options.add("4");
        options.add("5");
        options.add("6");
        TestInfo testInfo = new TestInfo();
        testInfo.setCorrectValue("B");
        testInfo.setTitleName("小提琴一共几根弦?");
        testInfo.setOptions(options);
        testInfos.add(testInfo);

        TestInfo testInfo2 = new TestInfo();
        List<String> options2 = new ArrayList<>();
        options2.add("正确");
        options2.add("错误");
        options2.add("");
        options2.add("");
        testInfo2.setCorrectValue("A");
        testInfo2.setTitleName("小提琴分电子小提琴和木琴?");
        testInfo2.setOptions(options2);
        testInfos.add(testInfo2);

        TestInfo testInfo3 = new TestInfo();
        List<String> options3 = new ArrayList<>();
        options3.add("正确");
        options3.add("错误");
        options3.add("");
        options3.add("");
        testInfo3.setCorrectValue("B");
        testInfo3.setTitleName("在不拉小提琴的时候，一定要把琴弓紧绷?");
        testInfo3.setOptions(options3);
        testInfos.add(testInfo3);

        return testInfos;
    }
}
