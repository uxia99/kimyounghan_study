package basic.scanner;

import java.util.Scanner;

public class ScannerWhileQuiz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하시오('종료'를 입력하면 종류) : ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하시오. : ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);

            System.out.println("\n- - - - -\n");


        }
    }
}
