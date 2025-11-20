import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Please enter your numbers:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("The first number is:" +x);
        int y = scanner.nextInt();
        System.out.println("The second number is:" +y);
        int sum = x + y;
        System.out.println("The sum is: " + sum);
        int substraction = x - y;
        System.out.println("The substraction is: " + substraction);
        int multiplication = x * y;
        System.out.println("The multiplication is: " + multiplication);
        int division = x/y;
        System.out.println("The division is: " + division);


        scanner.close();
    }
}