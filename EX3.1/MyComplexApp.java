import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args){
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter complex number 1 (real and imaginary part): ");
        double real1 = num1.nextDouble();
        double imag1 = num1.nextDouble();
        MyComplex c1 = new MyComplex(real1, imag1);

        System.out.println("Enter complex number 2 (real and imaginary part): ");
        double real2 = num1.nextDouble();
        double imag2 = num1.nextDouble();
        MyComplex c2 = new MyComplex(real2, imag2);

        System.out.println("Number 1 is: " + c1);
        System.out.println(c1 + (c1.isReal() ? " is a pure real number" : " is NOT a pure real number"));
        System.out.println(c1 + (c1.isImaginary() ? " is a pure imaginary number" : " is NOT a pure imaginary number"));

        System.out.println("Number 2 is: " + c2);
        System.out.println(c2 + (c2.isReal() ? " is a pure real number" : " is NOT a pure real number"));
        System.out.println(c2 + (c2.isImaginary() ? " is a pure imaginary number" : " is NOT a pure imaginary number"));


        System.out.println(c1 + (c1.equals(c2) ? " is equal to " : " is NOT equal to ") + c2);

        MyComplex sum = c1.addNew(c2);
        System.out.println(c1 + " + " + c2 + " = " + sum);

        num1.close();

    }
}
