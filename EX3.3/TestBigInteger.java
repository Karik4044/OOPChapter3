import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        // Create BigInteger instances using the string representation of the numbers
        BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        // Add the two BigInteger numbers
        BigInteger sum = i1.add(i2);
        // Print the result of the addition
        System.out.println("Sum: " + sum);

        // Multiply the two BigInteger numbers
        BigInteger product = i1.multiply(i2);
        // Print the result of the multiplication
        System.out.println("Product: " + product);
    }
}