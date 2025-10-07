import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        input.close();
        for(int i = 0; i <= 5; i++) {
            int result = i * x;
            System.out.println(x+ "x" + i + " = " + result);
            if (result == 12) {
                break; 
            }
        }
        System.out.println("Loop ended.");
    }
}
