package basic.scanner;

import java.util.Scanner;

public class ScannerQuiz5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하시오 : ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하시오 : ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("두 정수 사이의 모든 정수");

        for (int i = num1; i <= num2; i++) {

            System.out.print(i);

            if (i != num2) {
                System.out.print(", ");
            }
        }
    }
}
