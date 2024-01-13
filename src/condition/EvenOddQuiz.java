package condition;

public class EvenOddQuiz {
    public static void main(String[] args) {
        int x = 7;

        String result = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println("x = " + x + ", " + result); // x = 7, 홀수
    }
}
