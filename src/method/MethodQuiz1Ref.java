package method;

public class MethodQuiz1Ref {

    public static void main(String[] args) {
        System.out.println("평균값 = " + average(1, 2, 3)); // 2.0
        System.out.println("평균값 = " + average(15, 25, 35)); // 25.0
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3;
        return average;
    }
}
