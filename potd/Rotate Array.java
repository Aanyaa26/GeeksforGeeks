Date: 18.11.24

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        int k = d % n; // Handle cases where d > n

        // Reverse the first k elements
        reverse(arr, 0, k - 1);
        
        // Reverse the remaining n - k elements
        reverse(arr, k, n - 1);
        
        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    // Helper function to reverse elements of an array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Helper function to swap two elements in an array
    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
