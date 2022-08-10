package basic;

public class ComplexNumber {
    int real;
    int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void plus(ComplexNumber c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

    public void multiply(ComplexNumber c) {
        int CurReal = this.real;
        int CurImaginary = this.imaginary;
        this.real = (CurReal * c.real) - (CurImaginary * c.imaginary);
        this.imaginary = (CurReal * c.imaginary) + (CurImaginary * c.real);
    }

    public void print() {
        System.out.println(real + " + i" + imaginary);
    }
}