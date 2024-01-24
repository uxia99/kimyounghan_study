package condition;

public class Switch4 {
    public static void main(String[] args) {
        int grade = 3;
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("발급받으신 쿠폰 금액은 " + coupon + "원 입니다.");
    }
}
