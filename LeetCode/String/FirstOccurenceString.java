public class FirstOccurenceString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(firstOccurence(haystack, needle));
    }

    public static int firstOccurence(String haystack, String needle) {
        int n = needle.length();
        if (haystack.length() == needle.length()) {
            if (haystack.equals(needle)) {
                return 0;
            }
        }
        for (int i = 0; i < haystack.length() - n + 1; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}