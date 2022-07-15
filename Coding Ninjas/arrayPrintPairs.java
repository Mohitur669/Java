/*
* If I have a array {1, 4, 7, 6, 5}, we have to print
* (1,4)
(1,7)
(1,6)
(1,5)
(4,7)
(4,6)
(4,5)
(7,6)
(7,5)
(6,5)
* */
public class arrayPrintPairs {

    public static void printAllPairs(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 6, 5};
        printAllPairs(arr);
    }
}