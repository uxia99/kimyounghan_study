package basic.method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;
        printNumber((int) number); // int에 double을 넣을 수 없기 때문에 오류 발생 -> 강제 형변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자 : " + n);
    }
}
