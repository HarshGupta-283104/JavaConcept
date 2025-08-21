import java.util.*;

public class MergeSortedArrays {
    public static void rearrange(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;

        // Step 1: Merge both arrays into one list
        int[] merged = new int[n + m];
        int[] merged = new int[n + m];
        int idx = 0;

        for (int num : A) merged[idx++] = num;
        for (int num : B) merged[idx++] = num;

        // Step 2: Sort merged array
        Arrays.sort(merged);

        // Step 3: Fill back array A with first n smallest
        for (int i = 0; i < n; i++) {
            A[i] = merged[i];
        }

        // Step 4: Fill back array B with remaining m elements
        for (int i = 0; i < m; i++) {
            B[i] = merged[n + i];
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 9, 10, 15, 20};
        int[] B = {2, 3, 8, 13};

        rearrange(A, B);

        System.out.println("Array A: " + Arrays.toString(A));
        System.out.println("Array B: " + Arrays.toString(B));
    }
}
