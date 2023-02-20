import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        // int ans = nums.length;
        // for (int i = 0; i < nums.length; i++) {
        //     ans = ans ^ i ^ nums[i];
        // }
        // return ans;

        // Iterative Method
        // int n = nums.length ;
        // int max_sum = (n*(n+1)/2);
        // int sum = 0 ;
        // for(int elem : nums){
        //     sum+=elem;
        // }
        // return max_sum-sum;


        List<Integer> numList = Arrays.stream(nums).boxed().toList();
        int size = nums.length;
        for (int i = 0; i <= size; i++) {
            if (!numList.contains(i))
                return i;
        }
        return 0;
    }
}