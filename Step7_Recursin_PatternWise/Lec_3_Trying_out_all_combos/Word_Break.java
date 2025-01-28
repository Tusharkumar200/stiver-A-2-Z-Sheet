package Lec_3_Trying_out_all_combos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Word_Break {
    
    public boolean wordBreak(String s, List<String> wordDict) {
        int[][] dp = new int[s.length()][s.length()];
        for (int i[] : dp) {
            Arrays.fill(i, -1);
        }
        return solve(0, 0, s, new HashSet<>(wordDict), dp);
    }

    private boolean solve(int start, int end, String s, Set<String> wd, int[][] dp) {
        if (dp[start][end] != -1) return dp[start][end] == 1;

        if (end == s.length() - 1) {
            if (wd.contains(s.substring(start, end + 1))) return true;
            return false;
        }

        if (wd.contains(s.substring(start, end + 1))) {
            if (solve(end + 1, end + 1, s, wd, dp)) {
                dp[start][end] = 1;
                return true;
            }
        }
        dp[start][end] = solve(start, end + 1, s, wd, dp) ? 1 : 0;
        return dp[start][end] == 1;
    }

    public static void main(String[] args) {
        Word_Break wb = new Word_Break();
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        boolean result = wb.wordBreak(s, wordDict);
        System.out.println("Can the word \"" + s + "\" be segmented into a space-separated sequence of one or more dictionary words? " + result);
    }
}
 