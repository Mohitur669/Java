package exception_handling;

public class FractionException {
    private int numerator;
    private int denominator;

    public FractionException(int numerator, int denominator) {
        this.numerator = numerator;
//        if (denominator == 0) {
////            Fixme : Solve this error
//        }
        this.denominator = denominator;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int n) {
        this.numerator = n;
        simplify();
    }

    public void setDenominator(int d) throws ZeroDenominatorException{
        if (d == 0) {
            // Fixme : error out
            ZeroDenominatorException e = new ZeroDenominatorException();
            throw e;
        }
        this.denominator = d;
        this.simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i < smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void print() {
        if (denominator == 1) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    public void add(FractionException f2) {
        this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public static FractionException add(FractionException f1, FractionException f2) {
        int newNum = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int newDen = f1.denominator * f2.denominator;
        FractionException f = new FractionException(newNum, newDen);
        return f;
    }


    public void multiply(FractionException f2) {
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public static FractionException multiply(FractionException f1, FractionException f2) {
        int newNum = f1.numerator * f2.numerator;
        int newDen = f1.denominator * f2.denominator;
        FractionException f = new FractionException(newNum, newDen);
        return f;
    }
}