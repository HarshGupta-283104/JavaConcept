// Find the maximum and minimum elements in an array of integers
import java.util.*;
public class Q1MD {
    public int[] findMinMax(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return new int[]{max, min};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: "); 
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        Q1MD obj = new Q1MD();
        int[] result = obj.findMinMax(nums);
        System.out.println("Max: " + result[0] + ", Min: " + result[1]);
        System.out.println("Hello, welcome to the MidTerm Question 1!");
        sc.close();
    }
}