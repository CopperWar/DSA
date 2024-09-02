/**
 * array
 */
public class array {
    public static void main(String[] args) {
        int array[] = new int[5];
        System.out.println("Array before filling");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        
        System.out.println("Array after filling");
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}