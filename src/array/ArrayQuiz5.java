package array;

import java.util.Scanner;

public class ArrayQuiz5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하시오 : ");
        int num = scanner.nextInt();

        System.out.println(num + "개의 정수를 입력하시오 : ");
        int[] numbers = new int[num];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("입력한 정수의 합계 : ");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.print(sum);
        System.out.println();

        System.out.print("입력한 정수의 평균 : ");
        double average = (double) sum / num;
        System.out.print(average);
    }
}
