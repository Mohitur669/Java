public class searchInRange {
    public static void main(String[] args) {
        int[] array = {233,45,4,65,75,7,68,64,53,424,2,4253};
        int target = 68;
        System.out.println(searchInRange(array,target,3,7));
    }


//    searching in range that given by the user
    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index < end; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
