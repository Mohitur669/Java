public class test1 {
    public static void main(String[] args) {
        String test = "alb2c3";
        String[] tokens = test.split("\\d");
        for (String s : tokens)
            System.out.print(s);
    }
}