package Lec_2_Subsequences_Pattern;

/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Input: n = 3 Output: ["((()))","(()())","(())()","()(())","()()()"]

Input: n = 2 Output: [“()()”, “(())”]
 */

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    public static List<String> generateParentheses(int n) {
            
        List<String> Ans = new ArrayList<>();
        char[] currentString = new char[2*n];
        recurse(n,n,0,currentString,Ans);
        return Ans;
    }

    private static void recurse(int forwardParensNeeded, int backwardsParensNeeded, int currentIndex, 
                            char[] currentString, List<String> validAnswers) {
                if(forwardParensNeeded == 0 && backwardsParensNeeded == 0){
                    validAnswers.add(new String(currentString));
                    return;
                }

                if(forwardParensNeeded > 0){
                    currentString[currentIndex] = '(';
                    recurse(forwardParensNeeded-1, backwardsParensNeeded, currentIndex +1, currentString , validAnswers);
                }
                if(backwardsParensNeeded > 0 && forwardParensNeeded < backwardsParensNeeded){
                    currentString[currentIndex] = ')';
                    recurse(forwardParensNeeded, backwardsParensNeeded-1, currentIndex +1, currentString , validAnswers);
                }
                                
                    
    }
    public static void main(String[] args) {
        int n = 3; // Number of pairs of parentheses
        List<String> result = generateParentheses(n);
        System.out.println("All combinations of " + n + " pairs of parentheses:");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
