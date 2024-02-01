package scanner;

import java.util.Scanner;

public class ScannerQuiz4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단 출력을 원하는 숫자를 입력하시오. : ");
        int gugudan = scanner.nextInt();

        System.out.println(gugudan + "단의 구구단");

        for (int i = 1; i < 10; i++) {
            int multi = gugudan * i;
            System.out.println(gugudan + " * " + i + " = " + multi);
        }
    }
}
