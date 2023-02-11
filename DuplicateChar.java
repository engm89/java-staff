import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a sentence: ");
        String word = scanner.nextLine();
        System.out.println(word+" have duplicated letters: "+dupString(word));
        
    }

    public static String dupString (String sec){
        String chars = "";
        String dups = "";
        for (int i=0; i < sec.length(); i++){
            String currest = Character.toString(sec.charAt(i));
            if (chars.contains(currest)){
                if (!dups.contains(currest)){
                    dups += currest+ ",";
                }
            }
            chars += currest;
        }
        return dups;
    }
}
