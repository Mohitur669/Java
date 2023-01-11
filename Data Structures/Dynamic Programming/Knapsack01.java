/* 0 1 Knapsack:
A thief robbing a store can carry a maximal weight of W into his knapsack.
There are N items, and i-th item weigh 'Wi' and the value being 'Vi.'
What would be the maximum value V, that the thief can steal?

Input Format :
The first line of the input contains an integer value N, which denotes the total number of items.
The second line of input contains the N number of weights separated by a single space.
The third line of input contains the N number of values separated by a single space.
The fourth line of the input contains an integer value W, which denotes the maximum weight the thief can steal.
Output Format :
Print the maximum value of V that the thief can steal.

Constraints :
1 <= N <= 20
1<= Wi <= 100
1 <= Vi <= 100
Time Limit: 1 sec

Sample Input 1 :
4
1 2 4 5
5 4 8 6
5
Sample Output 1 :
13

Sample Input 2 :
5
12 7 11 8 9
24 13 23 15 16
26
Sample Output 2 :
51 */

public class Knapsack01 {
    // TODO: Knapsack DP code is not here
    public static int knapsackRecursion(int[] weights, int[] values, int maxWeight) {
        return knapsackRecursionHelper(weights, values, maxWeight, 0);
    }

    private static int knapsackRecursionHelper(int[] weights, int[] values, int maxWeight, int i) {
        if (i == weights.length || maxWeight == 0) {
            return 0;
        }
        if (weights[i] > maxWeight) {
            return knapsackRecursionHelper(weights, values, maxWeight, i + 1);
        } else {
            // Include i-th item
            int op1 = values[i] + knapsackRecursionHelper(weights, values, maxWeight - weights[i], i + 1);
            int op2 = knapsackRecursionHelper(weights, values, maxWeight, i + 1);
            return Math.max(op1, op2);
        }
    }

    public static int knapsackMemoization(int[] weights, int[] values, int maxWeight) {
        //Your code goes here
        return knapsackMemoizationHelper(weights, values, maxWeight, 0);
    }

    private static int knapsackMemoizationHelper(int[] weights, int[] values, int maxWeight, int i) {

        //base case
        if (i == weights.length || maxWeight == 0) return 0;
        if (weights[i] > maxWeight) {
            //return knapsack
            return knapsackMemoizationHelper(weights, values, maxWeight, i + 1);
        } else {
            //include ith element
            int op1 = values[i] + knapsackMemoizationHelper(weights, values, maxWeight - weights[i], i + 1);

            //not include ith element
            int op2 = knapsackMemoizationHelper(weights, values, maxWeight, i + 1);
            return Math.max(op1, op2);
        }
    }

    public static void main(String[] args) {
        int[] weights = {6, 1, 2, 4, 5};
        int[] values = {10, 5, 4, 8, 6};
        int maxWeight = 5;
//        System.out.println(knapsackDP(weights, values, maxWeight));
        System.out.println(knapsackMemoization(weights, values, maxWeight));
        System.out.println(knapsackRecursion(weights, values, maxWeight));
    }
}