public class Main {
    public static void main(String[] args){
        MyComplex c1 = new MyComplex();
        MyComplex c2 = new MyComplex(1.1,2.2);

        System.out.println(c1);
        System.out.println(c2);

        c2.setReal(2.2);
        c2.setImag(5.5);
        System.out.println(c2);

        System.out.println(c1 + (c1.isReal() ? " is a pure real number" : " is NOT a pure real number"));
        System.out.println(c1 + (c1.isImaginary() ? " is a pure imaginary number" : " is NOT a pure imaginary number"));

        System.out.println(c2 + (c2.isReal() ? " is a pure real number" : " is NOT a pure real number"));
        System.out.println(c2 + (c2.isImaginary() ? " is a pure imaginary number" : " is NOT a pure imaginary number"));

        // Check equality
        System.out.println(c1 + (c1.equals(c2) ? " is equal to " : " is NOT equal to ") + c2);

        // Perform addition
        MyComplex sum = c1.addNew(c2);
        System.out.println(c1 + " + " + c2 + " = " + sum);
    }
}