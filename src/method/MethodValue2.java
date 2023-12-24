package method;

public class MethodValue2 {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number = " + number); // 5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number = " + number); // 5 아래 메서드에서 num2에 10을 넣었기 때문에 num1은 변하지 않음
    }

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number = " + number); // 5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number = " + number); // 10
    }
}
