package method;

public class Method2 {

    // 매개변수, 반환 타입 모두 없는 경우
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 실행합니다 =");
        return;
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
