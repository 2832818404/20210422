package edo.xcdq;

/**
 * @author hongxiaozheng
 * @date 2021/4/22 8:30
 */
public class Phone {
    public double width;
    public double high;
    public int weight;
    public String color;

    //构造方法，用于在内存中创建对象
    public Phone(){
        System.out.println("我操你的");
    }
    //构造方法
    /*public Phone(double kuan,double gao,int zhong,String yuanse){
        width = kuan;
        high = gao;
        weight = zhong;
        color = yuanse;
    }*/
    public Phone(double width,double high,int weight,String color) {
        this.high = high;
        this.weight = weight;
        this.width = width;
        this.color = color;
    }
    public Phone( double kuan , double gao , int zhong){
        width = kuan;
        high = gao;
        weight = zhong;
    }
    public  void startUP(){
        System.out.println("手机在开机");
    }
    public void lookScreen(){
        System.out.println("手机在锁屏");
    }

    //
    public String toString(){
        return "{" + this.weight + " " + this.high + " " + this.weight + " " + this.color + "}";
    }

   public boolean equals(Object object) {
       if (this == object) {
           return true;
       }
       Phone temp = (Phone) object;
       if (temp.width == this.width && temp.high == this.high) {

           return true;

       } else {
           return false;
       }


   }
}
