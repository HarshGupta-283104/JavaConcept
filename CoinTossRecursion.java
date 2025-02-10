import java.util.Scanner;

public class CoinTossRecursion {
    public static void coinToss(int n, String result) {
        if (n == 0) {
            System.out.println(result);
            return;
        }
        // recursive calls for head
        coinToss(n - 1, result + "H");
        // recursive call for tail
        coinToss(n - 1, result + "T");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        coinToss(n, result);
    }
}