import java.util.Arrays;

public class RemoveDuplicatefromsorted {

    public static int removeDuplicates(int[] arr) {
        int n = arr.length;

        // If the array is empty or has only one element, return the array as is.
        if (n == 0 || n == 1) {
            return n;
        }

        // Variable to track the index of the next unique element.
        int uniqueIndex = 1;

        // Loop through the array to check for duplicates.
        for (int i = 1; i < n; i++) {
            boolean isDuplicate = false;

            // Check if the current element is a duplicate of any previous elements.
            for (int j = 0; j < uniqueIndex; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If no duplicates are found, move the unique element to the uniqueIndex.
            if (!isDuplicate) {
                arr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        int newLength = removeDuplicates(arr);

        // Print the array without duplicates.
        System.out.println("Array without duplicates: " + Arrays.toString(Arrays.copyOf(arr, newLength)));
    }
}
