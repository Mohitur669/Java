public class checkPermutation {
    public static void main(String[] args) {
        String str1 = "abcdee";
        String str2 = "abccde";
        System.out.println(isPermutation2(str1, str2));
    }

    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() == 0 || str2.length() == 0) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        int stringSum1 = 0;
        int stringSum2 = 0;
        for (int i = 0; i < str1.length(); i++) {
            stringSum1 = stringSum1 + str1.charAt(i);
            stringSum2 = stringSum2 + str2.charAt(i);
        }
        if (stringSum1 == stringSum2) {
            return true;
        }
        return false;
    }

    //  Coding Ninjas Solution --> Counting the frequency of a character
    public static boolean isPermutation2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        //creates a new integer frequency array
        int frequency[] = new int[256];
        //initialize every element of frequency array to zero
//        for (int i = 0; i < 256; i++) {
//            frequency[i] = 0;
//        }
        //Go through first str1
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            frequency[ch]++;
        }
        //Go through second str2
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            frequency[ch]--;
        }
        //go through frequency array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] != 0) {
                return false;
            }
        }
        return true;
    }
}