import java.util.Scanner;

public class countDigitsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count=0;
        while(number > 0){
            number = number/10;
            count++;
        }
        System.out.print("number of digits: "+count);
    }
}
