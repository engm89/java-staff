import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=1;

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        for (int i=0; i < text.length(); i++){
            if (text.charAt(i)==' ' && (text.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("number of words in \""+text+"\" equal to : "+count);
    }
}
