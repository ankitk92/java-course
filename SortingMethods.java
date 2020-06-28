import java.lang.*;

public class SortingMethods {

    public static void main(String[] args) {
        int[] arr = {100,500,3,88,89,900,1000,567};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}