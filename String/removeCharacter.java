public class removeCharacter {
    public static void main(String[] args) {
        String str = "aabccbaa";
        char ch = 'a';
        System.out.println(removeAllOccurrencesOfChar(str, ch));
    }

    public static String removeAllOccurrencesOfChar(String str, char ch) {
        if (str.length()==0){
            return str;
        }
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                answer = answer + str.charAt(i);
            }
        }
        return answer;
    }
}