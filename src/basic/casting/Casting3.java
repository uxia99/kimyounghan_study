package basic.casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue basic.casting = " + intValue); // 2147483647

        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver basic.casting = " + intValue); // -2147483648
    }
}
