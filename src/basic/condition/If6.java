package basic.condition;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10,000원 이상 구매하셔서 1,000원이 할인되었습니다."); // 10,000원 이상 구매하셔서 1,000원이 할인되었습니다.
        } else if (age <= 10) {
            discount += 1000;
            System.out.println("10세 이하셔서 1,000원이 할인되었습니다.");
        }

        System.out.println("총 할인 금액 : " + discount); // 총 할인 금액 : 1000
    }
}
