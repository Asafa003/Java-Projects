public class ExceptionHandling {
    
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;

            System.out.println("Result: " + (numerator / denominator));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
