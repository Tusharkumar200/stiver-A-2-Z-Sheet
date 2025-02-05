
class Infix_to_prefix {

    static boolean isalpha(char c) {
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    static boolean isdigit(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    static boolean isOperator(char c) {
        return (!isalpha(c) && !isdigit(c));
    }

    static String infixToPrefix(String exp) {

    }

    public static void main(String[] args) {
        String s = ("(p+q)*(c-d)");
        System.out.println("Infix expression: " + s);
        System.out.print("Prefix expression: ");
        System.out.print(infixToPrefix(s.toCharArray()));
    }
}