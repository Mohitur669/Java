import java.util.*;

public class TCSMedium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        Set<Integer> s = new HashSet<>();
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            s.add(arr[i]);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                int check = arr[i] + arr[j + 1];
                if (check % 2 == 0) {
                    int avg = check / 2;
                    if (s.contains(avg)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}