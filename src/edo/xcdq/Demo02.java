package edo.xcdq;

/**
 * @author hongxiaozheng
 * @date 2021/4/22 10:59
 */
public class Demo02 {
    String name;
    int age;

    public void fun(){
        System.out.println("普通成员方法");
    }

    class Inner{
        int sex;
        double high;

        public void fun01(){
            System.out.println("内部类中的普通方法");
        }
    }



}
