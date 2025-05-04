public class Q3MD {

    public void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Q3MD obj = new Q3MD();
        int[] arr = {1, 2, 3, 4, 5};
        obj.reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nHello, welcome to the MidTerm Question 3!");
    }
}
// What is the output of the following code?