import java.lang.*;

public class SortingMethods {

    public static void main(String[] args) {
        int[] arr = {
            100,
            500,
            3,
            88,
            89,
            900,
            1000,
            567
        };

        int[] arrBubSort = bubbleSort(arr);
        int[] arrSelSort = selectionSort(arr);
		
		System.out.println("Bubble Sort Output");
		
		for (int i = 0; i < arrBubSort.length; i++)
            System.out.println(arrBubSort[i]);
		
		System.out.println("\n");
		
		System.out.println("Selection Sort Output");
		
		for (int i = 0; i < arrSelSort.length; i++)
            System.out.println(arrSelSort[i]);

    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
		return arr;
    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int indexMin = i;
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {

                if (min > arr[j]) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            int temp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = temp;
        }
		return arr;

    }
}