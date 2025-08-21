public class Subarrays {
    public static void printSubarrays(int[] arr) {
        int n = arr.length;
        int maxSumSubarray = arr[0];
        // Generate all subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int currentSum = 0;
                // Print the subarray from start to end
                for (int k = start; k <= end; k++) {
                    currentSum += arr[k];

                    System.out.print(arr[k]+ " ");

                }

                if (currentSum > maxSumSubarray) {
                    maxSumSubarray = currentSum;
                }

                System.out.println();
            }
        }
        System.out.println("Maximum sum of subarrays: " + maxSumSubarray);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        System.out.println("Subarrays of the given array:");
        printSubarrays(array);
    }
}
