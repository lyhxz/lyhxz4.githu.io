public class tool {
    private int ages;
    private double R;
    void circular(double R){
     double S=3.14*R*R;
     double L=3.14*2*R;//计算圆的面积与周长
    }
    void rectangle(double l,double i){
        double S=l*i;
        double L=2*l+2*i;//计算长方形到面积与周长
    }
    void ages(int ages){
        if (ages<18){
            System.out.println("未成年");
        } else{
            System.out.println("已成年");
        }
    }
}

