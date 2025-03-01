import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a first nunber: ");
            int x = scanner.nextInt();

            System.out.println("Enter a second number: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Result: " + z);
        } 
        catch (ArithmeticException e) {
            System.out.println("You can't divide by zore! @_@");
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a number! *_*");
        }
        finally {
            System.out.println("Always show this message");
            scanner.close();
        }
    }
}
