package basic.array;

import java.util.Scanner;

public class ArrayQuiz7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열 만들어 값 입력받기
        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하시오 : ");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수 : ");
                scores[i][j] = scanner.nextInt();
            }
        }

        // 총점, 평균 반환

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < subjects.length; j++) {
                sum += scores[i][j];
            }
            double average = sum / 3.0;

            System.out.println((i+1) + "번 학생의 점수 총점 : " + sum + ", 평균 : " + average);
        }
    }
}
