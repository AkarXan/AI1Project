
/**
 * Write a description of class mathoperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int x = 20;

        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;

        System.out.println("The sum is: " + sum);
        System.out.println("The subtraction is: " + subtraction);
        System.out.println("The multiplication is: " + multiplication);
        System.out.println("The division is: " + division);
        
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));
        System.out.println("a++ = " + (a++));
        System.out.println("b-- = " + (b--));
        System.out.println("Value of a after a++ : " + a);
        System.out.println("Value of b after b-- : " + b);
        System.out.println("Unary minus of a = " + (-a));
        
        System.out.println("x = " + x);
        x += 5; System.out.println("x += 5 → " + x);
        x -= 3; System.out.println("x -= 3 → " + x);
        x *= 2; System.out.println("x *= 2 → " + x);
        x /= 4; System.out.println("x /= 4 → " + x);
        x %= 3; System.out.println("x %= 3 → " + x);
    }
}
