import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
    /*
    Draw the pattern
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
    
    */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of stars: ");
        int nStars = scanner.nextInt();
        for (int i=1; i <= nStars; i++){
            for (int j=0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=(nStars-1); i> 0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
