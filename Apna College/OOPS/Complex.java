public class Complex {
    private final int real;
    private final int imaginary;

    // Default constructor
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized constructor
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Copy constructor
    public Complex(Complex c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    // Method to display the complex number
    public void showComplex() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    // Method to add two complex numbers
    public Complex addComplex(Complex c) {
        int real = this.real + c.real;
        int imaginary = this.imaginary + c.imaginary;
        return new Complex(real, imaginary);
    }

    // Method to subtract two complex numbers
    public Complex subtractComplex(Complex c) {
        int real = this.real - c.real;
        int imaginary = this.imaginary - c.imaginary;
        return new Complex(real, imaginary);
    }

    // Method to multiply two complex numbers
    public Complex multiplyComplex(Complex c) {
        int real = (this.real * c.real) - (this.imaginary * c.imaginary);
        int imaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
        return new Complex(real, imaginary);
    }

    public static void main(String[] args) {
        // Create a complex number using the default constructor
        Complex c1 = new Complex();
        System.out.println("\nDefault Constructor: ");
        c1.showComplex(); // Output: 0 + 0i

        // Create a complex number using the parameterized constructor
        Complex c2 = new Complex(2, 3);
        System.out.println("\nFirst complex: ");
        c2.showComplex(); // Output: 2 + 3i

        // Create a complex number using the copy constructor
        Complex c3 = new Complex(c2);
        System.out.println("Second complex: ");
        c3.showComplex(); // Output: 2 + 3i

        // Add two complex numbers
        Complex sum = c2.addComplex(c3);
        System.out.println("\nAddition of two complex: ");
        sum.showComplex(); // Output: 4 + 6i

        // Subtract two complex numbers
        Complex difference = c2.subtractComplex(c3);
        System.out.println("\nSubstraction of two complex: ");
        difference.showComplex(); // Output: 0 + 0i

        // Multiply two complex numbers
        Complex product = c2.multiplyComplex(c3);
        System.out.println("\nMultiplication of two complex: ");
        product.showComplex(); // Output: -5 + 12i
    }
}