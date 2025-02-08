import java.util.Stack;

public class prefix_to_infix {
    static boolean isOperand(char x) {
        return (x >= 'a' && x <= 'z') ||
                (x >= 'A' && x <= 'Z');
    }

    static String preToInfix(String exp) {
        Stack<String> s = new Stack<String>();
        for (int i = exp.length() - 1; i >= 0; i--) {

            if (isOperand(exp.charAt(i))) {
                s.push(exp.charAt(i) + "");
            } else {
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
                s.push("(" + op1 + exp.charAt(i) + op2 + ")");
            }
        }
        return s.peek();
    }

    public static void main(String[] args) {
        String s = ("*+pq-cd");
        System.out.print("Prefix expression: " + s);
        System.out.println(" Infix expression: ");
        System.out.print(preToInfix(s));
    }
}
