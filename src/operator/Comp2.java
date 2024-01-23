package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "Hello".equals("Hello"); // 리터럴 비교
        boolean result2 = str1.equals("문자열1"); // 문자열 변수, 리터럴 비교
        boolean result3 = str2.equals(str2); // 문자열 변수 비교

        System.out.println(result1); // true
        System.out.println(result2); // true
        System.out.println(result3); // true
        // 다 true가 나왔지만 문자열을 ==로 비교하게 되면 간혹가다 오답이 나오기도 함
    }
}
