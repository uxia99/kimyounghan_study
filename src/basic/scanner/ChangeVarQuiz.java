package basic.scanner;

public class ChangeVarQuiz {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = 0;

        // 시작
        temp = a;
        a = b;
        b = temp;

        // 종료

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
