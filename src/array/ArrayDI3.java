package array;

public class ArrayDI3 {
    public static void main(String[] args) {
        // 2 X 3 2차원 배열
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // 0행 출력
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}