import org.w3c.dom.ls.LSOutput;

public class compressString {
    public static void main(String[] args) {
        String str = "aaabbccdsaa";
        System.out.println(getCompressedString(str));
    }

    public static String getCompressedString(String str) {
        if (str.length() == 0) {
            return str;
        }
        int count = 1;
        String output = "" + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (count > 1) {
                    output += count;
                    count = 1;
                }
                output += str.charAt(i);
            }
        }
        //to print the character count of last element
        if (count > 1) {
            output += count;
        }
        return output;
    }
}