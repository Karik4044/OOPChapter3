package java.exercise;

public class Main {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);

        System.out.println("Polynomial p1: " + p1);
        System.out.println("Polynomial p2: " + p2);

        System.out.println("Degree of p1: " + p1.getDegree());
        System.out.println("Degree of p2: " + p2.getDegree());

        System.out.println("p1 evaluated at x=2: " + p1.evaluate(2));

        MyPolynomial p3 = p1.add(p2);
        System.out.println("p1 + p2: " + p3);

        MyPolynomial p4 = p1.multiply(p2);
        System.out.println("p1 * p2: " + p4);
    }
}