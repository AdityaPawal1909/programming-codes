import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a, b, result;
        System.out.print("Enter first number : ");
        a = obj.nextInt();
        System.out.print("Enter second number : ");
        b = obj.nextInt();
        
        
        try {
            result = a / b;
            System.out.println("Result : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error : ");
        }
        obj.close();
    }
}
