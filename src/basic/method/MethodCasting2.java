package basic.method;

public class MethodCasting2 {

    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // 100.0
    }

    public static void printNumber(double a) {
        System.out.println("숫자 : " + a);
    }
}
