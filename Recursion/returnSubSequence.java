// Returning all the possible substrings can be made by the string

public class returnSubSequence {
    public static void main(String[] args) {
        String str = "xyz";
        String[] ans = findSubSequence(str);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static String[] findSubSequence(String str) {
        // base case
        if (str.length() == 0) {
            String[] ans = {""};
            return ans;
        }
        String[] smallAns = findSubSequence(str.substring(1));
        String[] ans = new String[2 * smallAns.length];

        // commented lines can be used in the place of inside code of for-loop
        // int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            // ans[k] = smallAns[i];
            ans[i] = smallAns[i];
            // k++;
        }
        for (int i = 0; i < smallAns.length; i++) {
            // ans[k] = str.charAt(0) + smallAns[i];
            ans[i + smallAns.length] = str.charAt(0) + smallAns[i];
            // k++;
        }
        return ans;
    }
}