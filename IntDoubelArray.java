import java.util.Arrays;
public class IntDoubelArray {
    public static void main(String[] args) {
        
        int[] intArray = new int [5];
        double[] doubleArray = new double[5];
        for (int i=0; i < intArray.length; i++){
            intArray[i] = (int) (Math.random()*100);
        }

        for (int i=0; i < doubleArray.length; i++){
            doubleArray[i]= Math.random() * 100;
        }

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubleArray));
            

    }
}
