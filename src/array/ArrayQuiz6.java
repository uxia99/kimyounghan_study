package array;

import java.util.Scanner;

public class ArrayQuiz6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 정수의 개수를 입력하시오 : ");
        int num = input.nextInt();

        System.out.println(num + "개의 정수를 입력하시오 : ");
        int[] numbers = new int[num];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);

    }
}
