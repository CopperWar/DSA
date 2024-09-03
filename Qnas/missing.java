
public class missing {

    public static void main(String[] args) {

        int array[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10};
        int xor = 0;

        for (int i = 0; i <= 10; i++) {
            xor = xor ^ i;
        }

        for (int num : array) {
            xor = xor ^ num;
        }
        System.out.println(xor);
    }
}
