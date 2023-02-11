import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Choose a operation Sum(a), Subtract(b), Multplication(c), Divion(d)");
        scanner.next();
        String s = scanner.nextLine();
        calculator(a, b, s);
        
    }

    public static void calculator(double a, double b, String c){
        switch (c) {
            case "a":
                System.out.println("The sum of "+a+" and "+b+" = "+a+b);
                break;
            case "b":
                System.out.println("The subtract of "+a+" and "+b+" = "+(a-b));
                break;
            case "c":
                System.out.println("The Multiply of "+a+" and "+b+" = "+a*b);
                break;
            case "d":
                System.out.println("The divsion of "+a+" and "+b+" = "+a/b);
                break;
            default:
                System.out.println("Error!, choose a operation (1, 2, 3, 4)");
        }
    }
}
