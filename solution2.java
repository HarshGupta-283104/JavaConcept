import java.util.ArrayList;
import java.util.List;

class Solution2 {
    // Using Recursion
    public static void solve(String digits, String output, int idx, List<String> ans, String[] mapping) {
        // Base case
        if (idx == digits.length()) {
            ans.add(output);
            return;
        }
        
        int num = digits.charAt(idx) - '0'; // accessing value of num index
        String val = mapping[num];
        
        for (int i = 0; i < val.length(); i++) {
            solve(digits, output + val.charAt(i), idx + 1, ans, mapping);
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;
        
        String output = "";
        String[] mapping = {
            "",    // 0
            "",    // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs",// 7
            "tuv", // 8
            "wxyz" // 9
        };
        
        solve(digits, output, 0, ans, mapping);
        return ans;
    }
}