package basic.operator;

public class OprAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자 사용 예시
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 증가시키고 그 값을 b에 대입
        System.out.println("a = " + a + ", b = " + b); // a = 2, b = 2

        // 후위 증감 연산자 사용 예시
        a = 1;
        b = 0;

        b = a++; // a의 현재 값을 b에 대입하고, 그 후 a를 증가시킴
        System.out.println("a = " + a + ", b = " + b); // a = 2, b = 1


        // 대입 연산이 아닌 경우 전위/후위 증감 연산자
        ++a;
        System.out.println("a = " + a); // 3

        a++;
        System.out.println("a = " + a); // 4
    }
}
