package basic.scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하시오 : ");
        String str = scanner.nextLine(); // 입력한 문자열을 String으로 가져옴
        System.out.println("입력한 문자열 : " + str);

        System.out.println("\n- - - - -\n");

        System.out.print("정수를 입력하시오 : ");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수 : " + intValue);

        System.out.println("\n- - - - -\n");

        System.out.print("실수를 입력하시오 : ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수 : " + doubleValue);
    }
}
