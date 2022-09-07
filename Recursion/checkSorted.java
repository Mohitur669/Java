// Checks an array is sorted or not
// look for better code into kunal.array package

public class checkSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 4, 5};
        System.out.println(sorted2(arr));
    }

    public static boolean sorted(int[] input) {
        if (input.length <= 1) {
            return true;
        }
        int[] smallInput = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }
        boolean smallAns = sorted(smallInput);
        if (!smallAns) {
            return false;
        }
        if (input[0] <= input[1]) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean sorted2(int[] input) {
        if (input.length <= 1) {
            return true;
        }
        if (input[0] > input[1]) {
            return false;
        }
        int[] smallInput = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }
        boolean smallAns = sorted2(smallInput);
//        if(smallAns){
//			return true;
//		}else{
//			return false;
//		}
        return smallAns;
    }
}