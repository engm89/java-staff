import java.util.Scanner;

public class Swap2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("There are five methods for swaping two numbers");
        System.out.println("1. Thrid variable");
        swap3rdVariable(x, y);
        System.out.println("2. using + and -");
        swapSumAndSub(x, y);
        System.out.println("3. using * and /");
        swapMultAndDivsion(x, y);
        System.out.println("4. using XOR");
        swapXor(x,y);
        System.out.println("5. using statement");
        swapSatement(x,y);
        
    }
    public static void swap3rdVariable(int a, int b){
        System.out.println("Before Swaping: "+a+" "+b);
        int t = a;
        a =b;
        b =t;
        System.out.println("After Swaping: "+a+" "+b);
    }
    public static void swapSumAndSub(int a, int b){
        System.out.println("Before Swaping: "+a+" "+b);
        a = b+a;
        b = a-b;
        a = a-b;
        System.out.println("After Swaping: "+a+" "+b);
    }
    public static void swapMultAndDivsion(int a, int b){
        System.out.println("Before Swaping: "+a+" "+b);
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("After Swaping: "+a+" "+b);
    }
    public static void swapXor(int a, int b){
        System.out.println("Before Swaping: "+a+" "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After Swaping: "+a+" "+b);
    }
    public static void swapSatement(int a, int b){
        System.out.println("Before Swaping: "+a+" "+b);
        b = a+b - (a=b);
        System.out.println("After Swaping: "+a+" "+b);
    }
}
