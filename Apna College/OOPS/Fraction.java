import java.util.Scanner;

public class Fraction {
    private int num, denom;

    // Default Constructor
    public Fraction() {
        num = 0;
        denom = 1;
    }

    // One Argument Constructor
    public Fraction(int num) {
        this.num = num;
        denom = 1;
    }

    // Two Argument Constructor
    public Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    // Copy Constructor
    public Fraction(Fraction f) {
        num = f.num;
        denom = f.denom;
    }

    // Method to display the fraction
    public void show() {
        System.out.println(num + "/" + denom);
    }

    // Method to add two fractions
    public Fraction add(Fraction f2) {
        int n = num * f2.denom + f2.num * denom;
        int d = denom * f2.denom;
        Fraction result = new Fraction(n, d);
        result.reduce();
        return result;
    }

    // Method to subtract two fractions
    public Fraction subtract(Fraction f2) {
        int n = num * f2.denom - f2.num * denom;
        int d = denom * f2.denom;
        Fraction result = new Fraction(n, d);
        result.reduce();
        return result;
    }

    // Method to multiply two fractions
    public Fraction multiply(Fraction f2) {
        int n = num * f2.num;
        int d = denom * f2.denom;
        Fraction result = new Fraction(n, d);
        result.reduce();
        return result;
    }

    // Method to divide two fractions
    public Fraction divide(Fraction f2) {
        int n = num * f2.denom;
        int d = denom * f2.num;
        Fraction result = new Fraction(n, d);
        result.reduce();
        return result;
    }

    // Method to compare two fractions
    public int compare(Fraction f2) {
        Fraction f1 = new Fraction(num, denom);
        f1.reduce();
        f2.reduce();
        if (f1.num == f2.num && f1.denom == f2.denom) {
            return 0;
        } else if (f1.num * f2.denom > f2.num * f1.denom) {
            return 1;
        } else {
            return -1;
        }
    }

    // Method to convert fraction to mixed fraction
    public void mixed() {
        if (num > denom) {
            int whole = num / denom;
            int rem = num % denom;
            System.out.println(whole + " " + rem + "/" + denom);
        } else {
            System.out.println(num + "/" + denom);
        }
    }

    // Method to reduce fraction to its simplest form
    public void reduce() {
        int gcd = findGCD(num, denom);
        num /= gcd;
        denom /= gcd;
    }

    // Method to find greatest common divisor
    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator and denominator of first fraction:");
        int num1 = sc.nextInt();
        int denom1 = sc.nextInt();
        Fraction f1 = new Fraction(num1, denom1);

        System.out.println("Enter numerator and denominator of second fraction:");
        int num2 = sc.nextInt();
        int denom2 = sc.nextInt();
        Fraction f2 = new Fraction(num2, denom2);
        System.out.println("\nFirst fraction:");
        f1.show();
        System.out.println("Second fraction:");
        f2.show();

        Fraction f3 = f1.add(f2);
        System.out.print("\nSum of fractions: ");
        f3.mixed();

        Fraction f4 = f1.subtract(f2);
        System.out.print("\nDifference of fractions: ");
        f4.mixed();

        Fraction f5 = f1.multiply(f2);
        System.out.print("\nProduct of fractions: ");
        f5.mixed();

        Fraction f6 = f1.divide(f2);
        System.out.print("\nQuotient of fractions: ");
        f6.mixed();

        int cmp = f1.compare(f2);
        if (cmp == 0) {
            System.out.println("\nFractions are equal");
        } else if (cmp == 1) {
            System.out.println("\nFirst fraction is greater");
        } else {
            System.out.println("\nSecond fraction is greater");
        }
    }
}