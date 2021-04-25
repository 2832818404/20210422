package edo.xcdq;

/**
 * @author hongxiaozheng
 * @date 2021/4/22 8:34
 */
public class Demo {
    public static void main(String[] args) {
        Phone iphoneSE3 = new Phone();
        iphoneSE3.width = 25;
        iphoneSE3.high = 55;
        iphoneSE3.weight = 155;
        iphoneSE3.color = "玫瑰金";
        Phone onePlus = new Phone(26,56,156,"琥珀蓝");
        System.out.println(iphoneSE3);  //edo.xcdq.Phone@1b6d3586
        System.out.println(onePlus);    //edo.xcdq.Phone@4554617c




    }
}
