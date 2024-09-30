public class Smallest {
    public static void main(String[] args) {
        int arr[] = {34, 56, 45, 67, 80, 43, 65};
        int n = arr.length;

        // Initialize min with the first element of the array
        int min = arr[0];

        // Iterate through the array starting from the second element
        for(int i = 1; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest number in the array: "+min);
}
}