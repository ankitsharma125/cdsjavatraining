package Array;

public class SortingInAscendingOrder {
        public static void main(String[] args) {
            int[] arr = {1, 7, 3, 11, 24, 9};
    
            System.out.println("Original array:");
            for ( int array : arr) {
                System.out.println(array);
            }
    
            bubbleSort(arr);

            System.out.println("Sorted array:");
            for ( int array : arr) {
                System.out.println(array);
            }
        }
    
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // swap arr[j] and arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
}
