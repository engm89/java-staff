import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to be reverse: ");
        String word = scanner.nextLine();
        System.out.print("The word before reverse: "+ word);
        System.out.println("\n");
        System.out.print("The word after reverse: "+resString(word));
    }

    public static String resString(String s){
        char[] letters = new char[s.length()];
        int letIndex =0;
        for (int i=s.length()-1; i >= 0; i--){
            letters[letIndex] = s.charAt(i);
            letIndex++;
        }
        String reverse = "";
        for (int i=0; i < s.length(); i++)
            reverse = reverse + letters[i];
        return reverse;
    }
}
