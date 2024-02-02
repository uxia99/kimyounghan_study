package scanner;

import java.util.Scanner;

public class ScannerQuiz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("주문하실 메뉴 이름을 입력하시오 : ");
        String foodName = scanner.nextLine();

        System.out.print("주문하실 메뉴의 가격을 입력하시오 : ");
        int foodPrice = scanner.nextInt();

        System.out.print("주문하실 메뉴의 수량을 입력하시오 : ");
        int foodQuantity = scanner.nextInt();

        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 가격은 " + foodPrice + "원 입니다.");
    }
}
