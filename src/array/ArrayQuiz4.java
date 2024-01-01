package array;

import java.util.Scanner;

public class ArrayQuiz4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하시오 : ");
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("입력한 정수의 합계 : ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
        System.out.println();

        System.out.print("입력한 정수의 합계 : ");
        double average = (double) sum / 5;
        System.out.print(average);
        System.out.println();
    }
}