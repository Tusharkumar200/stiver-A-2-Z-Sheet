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
                
                                
                    
    }
    public static void main(String[] args) {
        
    }
}
