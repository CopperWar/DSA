import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {
        int[] array = new int[5];
        
        System.out.println("Array before filling: " + Arrays.toString(array));

        // Fill the array with values
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        
        System.out.println("Array after filling: " + Arrays.toString(array));

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the index to replace: ");
            int index = sc.nextInt();
            
            System.out.print("Enter the new value: ");
            int newVal = sc.nextInt();
            
            // Replace the value at the specified index
            System.out.println("Old array: " + Arrays.toString(array));
            array[index] = newVal;
            System.out.println("New array: " + Arrays.toString(array));
        }
    }
}
