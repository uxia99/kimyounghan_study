package intermediate.ref;

public class VarChange1 {

    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 10

        // a 변경
        a = 20;
        System.out.println("변경된 a = " + a); // 20
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10

        // b 변경
        b = 30;
        System.out.println("변경된 b = " + b); // 30
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 30
    }
}
