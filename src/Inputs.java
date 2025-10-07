import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old.");

        if (age < 18) {
            System.out.println("You are a minor.");
        }
        else if (age >= 18 && age <=60) {
            System.out.println("You are an adult.");
            if (age >= 18 && age <=30) {
                System.out.println("You are a young adult."); 
            }
            else if (age >30 && age <=40) {
                System.out.println("You are in your 30s.");
            }
            else if (age >40 && age <=50) {
                System.out.println("You are in your 40s.");
            }
            else {
                System.out.println("You are in your 50s.");
            }
        }
         else {
            System.out.println("You are a senior citizen.");
        }
        input.close();
    }
}
