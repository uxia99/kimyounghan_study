package basic.operator;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;
        a += 3;

        System.out.println(a); // 8

        a -= 2;
        System.out.println(a); // 6

        a *= 4;
        System.out.println(a); // 24

        a /= 3;
        System.out.println(a); // 8

        a %= 5;
        System.out.println(a); // 3
    }
}
