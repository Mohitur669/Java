public class maxWealth {

//    leetcode: https://leetcode.com/problems/richest-customer-wealth/submissions/
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 4, 1}};
        System.out.println(maximumWealth(accounts));
    }

    //    calculate maxWealth function
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
//        person = row
//        accounts = col
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
//            when you start a new col, take a new sum for that row
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // now we have the sum of the account wealth in bank
            //check the overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
