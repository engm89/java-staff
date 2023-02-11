import java.util.Scanner;

public class FactNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("The factorial for "+number+" equals "+factNum(number));
    }
    public static int factNum(int n){
        if(n==1){
            return 1;
        } else{
            return n * factNum(n-1);
        }
        
    }
}
