import java.util.Scanner;

public class ScaEx {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your height:");
        double height = sc.nextDouble();

        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My height is " + height);

        sc.close(); // good practice to close Scanner
    }
}
