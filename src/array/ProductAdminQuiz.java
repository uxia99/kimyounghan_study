package array;

import java.util.Scanner;

public class ProductAdminQuiz {

    public static void main(String[] args) {
        int maxProducts = 3; // 상품 등록은 10개까지만
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0; // 현재 등록된 상품의 개수를 저장할 변수

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("\n1.상품등록 | 2.상품목록 | 3.종료\n메뉴를 선택하시오 : ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                if (productCount < maxProducts) {
                    System.out.print("상품명을 입력하시오 : ");
                    productNames[productCount] = scanner.nextLine();

                    System.out.print("상품 가격을 입력하시오 : ");
                    productPrices[productCount] = scanner.nextInt();

                    productCount++;
                } else {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
            }

            if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                } else {
                    for (int i = 0; i < productNames.length; i++) {
                        System.out.println(productNames[i] + " : ₩" + productPrices[i]);
                    }
                }
            }

            if (menu == 3) {
                System.out.println("\n프로그램을 종료합니다.");
                break;
            }
        }
    }
}
