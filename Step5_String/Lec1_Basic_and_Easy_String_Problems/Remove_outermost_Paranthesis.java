package Step5_String.Lec1_Basic_and_Easy_String_Problems;

public class Remove_outermost_Paranthesis {

    public String removeOuterParentheses(String s) {
        int cnt=0;
        StringBuilder  ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ')'){
                cnt--;
            }

            if(cnt !=0){
                ans.append(s.charAt(i));
            }

            if(s.charAt(i) == '('){
                cnt++;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Remove_outermost_Paranthesis rop = new Remove_outermost_Paranthesis();
        String result = rop.removeOuterParentheses("(()())(())");
        System.out.println(result); // Expected output: ()()()
    }
}
