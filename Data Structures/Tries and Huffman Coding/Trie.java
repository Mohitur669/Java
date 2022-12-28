/* This is a working Dictionary Code */

import java.util.ArrayList;

class TrieNode {
    char data;
    boolean isTerminating;
    TrieNode[] children;
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode('\0'); // \0 means null character
    }

    private void addHelper(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminating = true;
            return;
        }
        /* We are assuming that word contains only lowercase alphabets */
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        addHelper(child, word.substring(1));
    }

    public void add(String word) {
        addHelper(root, word);
    }

    private boolean searchHelper(TrieNode root, String word) {
        if (word.length() == 0) {
            return root.isTerminating;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return false;
        }
        return searchHelper(child, word.substring(1));
    }

    public boolean search(String word) {
        return searchHelper(root, word);
    }

    public void removeHelper(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminating = false;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return;
        }
        removeHelper(child, word.substring(1));
        /* We can remove child only if it is  terminating, and it's number of children are 0
        Below lines to complete delete the word from the memory,
        previously we were just removing the final element to non-terminating not deleting the whole word from memory.
        This is for just memory optimization. */
//        if (!child.isTerminating) {
//            int numChild = 0;
//            for (int i = 0; i < 26; i++) {
//                if (child.children[i] != null) {
//                    numChild++;
//                }
//            }
//            /* We are changing the root children and child children references to null,
//            after that automatically Java Garbage Collector will delete that chunk of data from the memory. */
//            if (numChild == 0) {
//                // if num of child is null then we can delete it
//                root.children[childIndex] = null;
//                child = null;
//            }
//        }
        /* To avoid the 26 length for loop we can simply do this with the help of using childCount
            in the addHelper function and TrieNode properties. */
        if (!child.isTerminating && child.childCount == 0) {
            root.children[childIndex] = null;
            child = null;
            root.childCount--;
        }
    }

    public void remove(String word) {
        removeHelper(root, word);
    }

    public int countWords() {
        return countWordsHelper(root);
    }

    private int countWordsHelper(TrieNode root) {
        int count = 0;
        if (root.isTerminating) {
            count++;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null)
                count += countWordsHelper(root.children[i]);
        }
        return count;
    }

    // Find Pattern Matching Words
    public boolean patternMatching(ArrayList<String> input, String pattern) {
        for (int i = 0; i < input.size(); i++) {
            String word = input.get(i);
            for (int j = 0; j < word.length(); j++) {
                add(word.substring(j));
            }
        }
        return searchHelper(root, pattern);
    }

    // For using palindrome pair, we need this function
    public String reverse(String word) {
        String xString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            xString += word.charAt(i);
        }
        return xString;
    }

    /* Find Palindrome Pair */
    public boolean isPalindromePair(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String string = reverse(words.get(i));
            Trie suffixTrie = new Trie();
            for (int j = 0; j < string.length(); j++) {
                suffixTrie.add(string.substring(j));
            }
            for (String word : words) {
                if (suffixTrie.search(word)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Auto Complete Words
    public void autoComplete(ArrayList<String> input, String word) {
        int i = 0;
        while (i < input.size()) {
            String a = input.get(i);
            addHelper(root, a);
            i++;
        }
        if (root == null || root.childCount == 0) {
            return;
        }
        TrieNode a = findWord(root, word);
        String output = "";
        allWords(a, word, output);
    }

    public void allWords(TrieNode root, String word, String output) {
        if (root == null) {
            return;
        }

        if (root != null && root.childCount == 0) {
            if (output.length() > 0) {
                System.out.println(word + output);
            }
            return;
        }
        if (root != null && root.isTerminating == true) {
            System.out.println(word + output);
        }

        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                String ans = output + root.children[i].data;
                allWords(root.children[i], word, ans);
            }
        }
    }

    public TrieNode findWord(TrieNode root, String word) {
        if (word.length() == 0) {
            return root;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return null;
        }
        return findWord(child, word.substring(1));
    }
}