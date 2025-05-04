public class Q2MD {

    public static void main(String[] args) {
        //rotate the elements of an array to the right by k steps
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = nums.length;
        int[] result = new int[n];  // create a new array to store the rotated elements'
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];  // rotate the elements to the right by k steps
        }
        // print the rotated elements   
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("\nHello, welcome to the MidTerm Question 2!");

    }
}