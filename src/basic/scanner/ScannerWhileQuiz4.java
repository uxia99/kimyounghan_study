package basic.scanner;

import java.util.Scanner;

public class ScannerWhileQuiz4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int price = 0;
        int quantity = 0;
        int total = 0;


        while (true) {
            System.out.println("1.상품명 2.결제 3.프로그램 종료");

            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("상품명을 입력하시오 : ");
                name = scanner.nextLine();
                scanner.nextLine();

                System.out.print("상품 가격을 입력하시오 : ");
                price = scanner.nextInt();
                scanner.nextLine();

                System.out.print("구매 수량을 입력하시오 : ");
                quantity = scanner.nextInt();
                scanner.nextLine();

                System.out.println();

                System.out.println("상품명 : " + name + ", 상품 가격 : ₩" + price + ", 구매 수량 : " + quantity + "개");

                System.out.println();
            } else if (option == 2) {
                total = price * quantity;
                System.out.println("총 결제 금액 : ₩" + total);

                System.out.println();
            } else {
                System.out.println("프로그램 종료");
            }
        }
    }
}
