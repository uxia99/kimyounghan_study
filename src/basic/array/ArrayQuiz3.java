package basic.array;

import java.util.Scanner;

public class ArrayQuiz3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하시오 : ");
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}