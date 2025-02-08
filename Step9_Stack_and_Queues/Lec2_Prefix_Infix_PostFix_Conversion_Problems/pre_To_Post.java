import java.util.Stack;

public class pre_To_Post {

        static boolean isOperand(char x) {
            return (x >= 'a' && x <= 'z') ||
                    (x >= 'A' && x <= 'Z');
        }

    static String preToPost(String exp) {
        Stack<String> s = new Stack<String>();
        for (int i = exp.length() - 1; i >= 0; i--) {

            if (isOperand(exp.charAt(i))) {
                s.push(exp.charAt(i) + "");
            } else {
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
                s.push(op1 + op2 +exp.charAt(i));
            }
        }
        return s.peek();
    }

    public static void main(String[] args) {
        String s = ("-ab*+def");
        System.out.print(preToPost(s));
    }
}
