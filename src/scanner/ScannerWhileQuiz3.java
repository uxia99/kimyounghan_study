package scanner;

import java.util.Scanner;

public class ScannerWhileQuiz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int num = 0;

        while (true) {
            System.out.print("임의의 정수를 입력하시오(중단하려는 경우 -1을 입력하시오) : ");
            num = scanner.nextInt();

            if (num == -1) {
                System.out.println("\n- - - - -\n");
                break;
            }

            sum += num;
            count++;
        }

        double average = sum / count;
        System.out.println("입력한 정수들의 합계 : " + sum);
        System.out.println("입력한 정수들의 평균 : " + average);
    }
}
