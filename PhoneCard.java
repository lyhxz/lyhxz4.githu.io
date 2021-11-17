public class PhoneCard {
         String username = "cardNumber";
         public double initMoney = 30;
         public int time = 5;
    }

class cardip extends PhoneCard {
    void minMoney(){
        double minMoney=initMoney-time*0.3;
        System.out.println("您的IP卡余额为"+minMoney+"元");
   }
}

class card201 extends PhoneCard {
    void minMoney(){
        double minMoney=initMoney-time*0.45;
        System.out.println("您的201卡余额为"+minMoney+"元");
    }
}
class output{
    public static void main(String[] args){
        cardip a=new cardip();
        a.minMoney();
        card201 b=new card201();
        b.minMoney();
    }

}


