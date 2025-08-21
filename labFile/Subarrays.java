public class Subarrays {
    public static void printSubarrays(int[] arr) {
        int n = arr.length;
        
        // Generate all subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Print the subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        System.out.println("Subarrays of the given array:");
        printSubarrays(array);
    }
}
