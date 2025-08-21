public class RotateCyclic {
    public static void rotateCyclic(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than the array length

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {4, 5, 1, 2, 3};
        int k = 2;

        rotateCyclic(numbers, k);

        System.out.print("Array after rotation: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
