package condition;

public class Switch1 {
    public static void main(String[] args) {
     int grade = 3;
     int coupon = 0;

     if (grade == 1) {
         coupon = 1000;
     } else if (grade == 2) {
         coupon = 2000;
     } else if (grade == 3) {
         coupon = 3000;
     } else {
         coupon = 500;
     }

     System.out.println("발급받으신 쿠폰 금액은 " + coupon + "원 입니다.");
     // 발급받으신 쿠폰 금액은 3000원 입니다.
    }
}
