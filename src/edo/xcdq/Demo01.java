package edo.xcdq;

/**
 * @author hongxiaozheng
 * @date 2021/4/22 10:36
 */
public class Demo01 {
    //2 普通的属性或者代码块其次执行，从上往下执行
    int size = 1;
    //代码块
    {
        size = 10;
    }

    //1 被static最先执行，都被修饰的从上往下执行
    static {
        count = 3;
    }
    static int count = 30;

    //3 最后执行结构方法
    public Demo01(){
        System.out.println(size);
        System.out.println(count);
    }
}
