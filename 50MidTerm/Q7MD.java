public class Q7MD {

    public int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Q7MD obj = new Q7MD();
        System.out.println(obj.secondLargest(arr));
    } 
}