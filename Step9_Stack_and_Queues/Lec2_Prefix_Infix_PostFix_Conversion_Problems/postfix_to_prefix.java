import java.util.Stack;

public class postfix_to_prefix {
    static boolean isOperand(char x) {
        return (x >= 'a' && x <= 'z') ||
                (x >= 'A' && x <= 'Z');
    }

    static String postToPre(String exp) {
         Stack<String> s = new Stack<String>();
        for (int i = 0; i < exp.length(); i++) {
           
            if (isOperand(exp.charAt(i))) {
                s.push(exp.charAt(i) + "");
            } else {
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
                s.push(exp.charAt(i) +  op2 + op1 );
            }
        }
        return s.peek();
       
    }
    public static void main(String[] args) {
        String exp = "ab-de+f*/";
        System.out.println(postToPre(exp));
    }
}
