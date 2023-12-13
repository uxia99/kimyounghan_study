package basic.scanner;

import java.util.Scanner;

public class ScannerQuiz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하시오. : ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수 입니다.");
        } else {
            System.out.println("입력하신 숫자는 홀수 입니다.");
        }
    }
}
