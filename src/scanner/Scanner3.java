package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("비교할 첫 번째 숫자를 입력하시오.");
        int num1 = scanner.nextInt();

        System.out.print("비교할 두 번째 숫자를 입력하시오.");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + "이 더 큽니다.");
        } else if (num1 < num2) {
            System.out.println(num2 + "이 더 큽니다.");
        } else {
            System.out.println("두 숫자의 값이 같습니다.");
        }
    }
}
