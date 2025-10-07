public class Arithmetic {
    public static void main(String[] args) {
        int num1, num2, sum, subtraction, multiplication, division, remainder;
        num1 = 10;
        num2 = 5;
        sum = num1 + num2;
        subtraction = num1 - num2;
        multiplication = ((num1 + num2)/num2) * num2; 
        division = num1 / num2;
        remainder = num1 % num2;
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);
        System.out.println(num1 += 5); // num1 = num1 + 5
        System.out.println(num2++); // num2 = num2 + 1
    }
}
