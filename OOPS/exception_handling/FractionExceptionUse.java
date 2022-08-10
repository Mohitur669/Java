package exception_handling;

public class FractionExceptionUse {
    public static void main(String[] args) /*'throws ZeroDenominatorException' --> if I want to throw(passing) an exception,
    but if I don't want to throw an exception means want to handle the exception not need to write 'throws ZeroDenominatorException'
    in main function. Just need to write another line of code 'try & catch' syntax*/ {
        FractionException f1 = new FractionException(20, 30);
        f1.print();
        // 2/3

        f1.setNumerator(12);
        // 4/1
        int d = f1.getDenominator();
        System.out.println(d);
        f1.print();

        f1.setNumerator(10);
//        f1.setDenominator(0); // throws zero denominator exception
//        handling the exception -->
        /*test variable for exception*/
        int i = 0;
        try {
            f1.setDenominator(0);
            i++;
//            if an exception is met in try syntax then after that the code will jump to catch statement
//            for example, here i++ won't get executed because it met the exception
//            but if I put the i++ before f1.setDenominator(0) then it will be executed
        } catch (ZeroDenominatorException e) {
            System.out.println("Denominator can't be zero!");
        } // finally {
//            What Is finally? finally defines a block of code we use along with the try keyword.
//            It defines code that's always run after the try and any catch block, before the method is completed.
//            The 'finally' block executes regardless of whether an exception is thrown or caught.
//        }

        System.out.println("Value of i: " + i);
        // 1/3

        f1.print();

        FractionException f2 = new FractionException(3, 4);
        f1.add(f2);
        f1.print();
        // f1 => 13/12
        f2.print();
        // f2 => 3/4

        FractionException f3 = new FractionException(4, 5);
        f3.multiply(f2);
        f3.print();
        // f3 => 3/5
        f2.print();
        // f2 => 3/4

        FractionException f4 = FractionException.add(f1, f3);
        f1.print();
        f3.print();
        f4.print();
        FractionException f5 = FractionException.multiply(f1, f2);
        f5.print();
    }
}