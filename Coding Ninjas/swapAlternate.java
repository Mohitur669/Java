// Find the alternate elements in the array
// {1,2,3,4,5,6}
// {2,1,4,3,6,5}
public class swapAlternate {

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8,9};
        swapAlternate(arr);
        printArray(arr); //outputs {6,5,8,7,9}
    }
    public static void swapAlternate(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}