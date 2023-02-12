import java.util.Arrays;

import javax.lang.model.util.Elements.Origin;

public class ArrayCopy {
    public static void main(String[] args) {
        String[] sArString = {"Alice", "Bob", "tim", "John", "Denice"};
        System.out.println("Original Array "+Arrays.toString(sArString));
        String[] copiedArray = copyArray(sArString);
        System.out.println("Copied Array : "+Arrays.toString(copiedArray)); 
        
    }

    public static String[] copyArray(String[] sArray){
        String[] newArray = new String [sArray.length];
        for (int i=0; i < sArray.length; i++){
            newArray[i] = sArray[i];
        }
        return newArray;
    }
}
