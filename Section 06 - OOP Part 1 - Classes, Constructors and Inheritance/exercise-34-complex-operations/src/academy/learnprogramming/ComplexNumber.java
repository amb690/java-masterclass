package academy.learnprogramming;

public class ComplexNumber {

    private double real, imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(ComplexNumber number) {
        this.real += number.getReal();
        this.imaginary += number.getImaginary();
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void subtract(ComplexNumber number) {
        this.real -= number.getReal();
        this.imaginary -= number.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
