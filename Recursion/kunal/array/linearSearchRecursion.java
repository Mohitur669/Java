// Using Linear Search with recursion

package kunal.array;

import java.util.ArrayList;

public class linearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 5, 67, 7, 8, 8};
        int target = 4;
//        System.out.println(linearLastElement(arr, target, arr.length - 1));
//        System.out.println(linear(arr, target, 0));
//        System.out.println(linearBoolean(arr, target, 0));
//        linearAllIndex(arr, 4, 0);
//        System.out.println(listIndex);
        System.out.println(linearAllIndexArraylistArgument(arr, 4, 0, listIndex));
//        System.out.println(linearAllIndexArraylistWithoutArgument(arr, 4, 0));
    }

    // function to find the first element that matches the target
    static int linear(int[] input, int target, int index) {
        // base condition
        if (index == input.length) {
            return -1;
        }
        if (input[index] == target) {
            return index;
        } else {
            return linear(input, target, index + 1);
        }
    }

    // function to find the last element that matches the target
    static int linearLastElement(int[] input, int target, int index) {
        // base condition
        if (index == -1) {
            return -1;
        }
        if (input[index] == target) {
            return index;
        } else {
            return linearLastElement(input, target, index - 1);
        }
    }

    // function to show that the element is in the array or not
    static boolean linearBoolean(int[] input, int target, int index) {
        if (index == input.length) {
            return false;
        }
        return input[index] == target || linearBoolean(input, target, index + 1);
    }

    // if I want to get all the matching elements in the answer we have to form a arraylist
    static ArrayList<Integer> listIndex = new ArrayList<>();

    // adding the indices in the arraylist then returning the array
    static void linearAllIndex(int[] input, int target, int index) {
        // base condition
        if (index == input.length) {
            return;
        }
        if (input[index] == target) {
            listIndex.add(index);
        }
        linearAllIndex(input, target, index + 1);
    }

    // Using the arraylist as an argument and returning an arraylist
    static ArrayList<Integer> linearAllIndexArraylistArgument(int[] input, int target, int index, ArrayList<Integer> listIndex) {
        // base condition
        if (index == input.length) {
            return listIndex;
        }
        if (input[index] == target) {
            listIndex.add(index);
        }
        return linearAllIndexArraylistArgument(input, target, index + 1, listIndex);
    }

    // don't use below code because it's creating a new arraylist everytime the function call happens
    // returning the arraylist without passing the argument
    static ArrayList<Integer> linearAllIndexArraylistWithoutArgument(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = linearAllIndexArraylistWithoutArgument(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}