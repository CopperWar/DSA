

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class quicksort {

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter the Size of the array:");
    //     int size = sc.nextInt();  // Get the size of the array from the user

    //     ArrayList<Integer> array = new ArrayList<Integer>(size);  // Initialize the array with the specified size
    //     System.out.println("Enter the elements of the array:");
    //     for (int i = 0; i < size; i++) {
    //         array.add(sc.nextInt());
    //     }
    //     System.out.println("Unsorted array: " + array);
    //     array.add(Ientger.MAX_VALUE);
    //     sorting(array, 0, size);
    //     System.out.println("Sorted array: " + Arrays.toString(array));
    // }

    // private static void sorting(int[] array, int l, int h) {
    //     if (l < h) {
    //         int j = partition(array, l, h);
    //         sorting(array, l, j);
    //         sorting(array, j + 1, h);
    //     }
    // }

    // private static int partition(int[] array, int l, int h) {
    //     int pivot = array[l];
    //     int i = l, j = h;

    //     while (i < j) {
    //         do {
    //             i++;
    //         } while (i <= h && array[i] <= pivot);

    //         do {
    //             --j;
    //         } while (j >= l && array[j] > pivot);

    //         if (i < j) {
    //             swap(array, i, j);
    //         }
    //     }
    //     swap(array, l, j);
    //     return j;
    // }

    // private static void swap(int[] array, int i, int j) {
    //     int temp = array[i];
    //     array[i] = array[j];
    //     array[j] = temp;
    // }
}
