// Printing all the possible substrings can be made by the string
// This code works better than returnSubsequence code

public class printSubSequence {
    public static void main(String[] args) {
        printSubSequences("xyz");
    }

    public static void printSubSequences(String input) {
        // base case
        printSubSequences(input, "");
    }

    public static void printSubSequences(String input, String outputSoFar) {
        // base case
        if (input.length() == 0) {
            System.out.println(outputSoFar);
            return;
        }
        // we choose not to include the first character
        printSubSequences(input.substring(1), outputSoFar);
        // we choose to include the first character
        printSubSequences(input.substring(1), outputSoFar + input.charAt(0));
    }
}