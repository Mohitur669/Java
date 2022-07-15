//          1
//         232
//        34543
//       4567654

public class upperTriangleOfNumbers {
    public static void main(String[] args) {
        code2(4);
    }

    static void code1(int n) {
        for (int row = 1; row <= n; row++) {
            int num = row;
            for (int col = 1; col <= n + row - 1; col++) {
                if (col <= n - row) {
                    System.out.print(" ");
                } else if (col < n) {
                    System.out.print(num);
                    num++;
                } else {
                    System.out.print(num);
                    num--;
                }
            }
            System.out.println();
        }
    }

    static void code2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            int temp = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(temp);
                temp++;
            }
            temp--;
            for (int k = 1; k < row; k++) {
                temp--;
                System.out.print(temp);
            }
            System.out.println();
        }
    }
}