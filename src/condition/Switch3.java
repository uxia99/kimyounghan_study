package condition;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 3;
        int coupon = 0;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3: 
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println("발급받으신 쿠폰 금액은 " + coupon + " 원 입니다.");
    }
}
