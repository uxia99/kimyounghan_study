package basic.method;

public class MethodValue1 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1 = " + num1); // 5
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1 = " + num1); // 5 아래 메서드에서 num2에 10을 넣었기 때문에 num1은 변하지 않음
    }

    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2 = " + num2); // 5
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2 = " + num2); // 10
    }
}
