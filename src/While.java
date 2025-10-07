import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        int i = 0;
        while(x < 5) {
            System.out.println("Enter a number: ");
            x = input.nextInt();
            i++;
        }
        System.out.println("You entered " + i + " numbers.");
        input.close();
    }
}
