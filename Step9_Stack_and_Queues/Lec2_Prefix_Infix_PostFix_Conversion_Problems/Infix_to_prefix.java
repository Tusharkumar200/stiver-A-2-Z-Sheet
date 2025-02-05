
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

    static int getPriority(char C) {
        if(C == '-' || C == '+') return 1;
        else if(C == '*' || C == '/') return 2;
        else if(C == '^') return 3;
        return 0;
    }
    static String reverse(char str[], int start, int end) {
        char temp;
        while(start < end){
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(str);
    }
    static String infixToPostfix(char[] infix1) {

    }

    static String infixToPrefix(char[] infix) {

    }



    public static void main(String[] args) {
        String s = ("(p+q)*(c-d)");
        System.out.println("Infix expression: " + s);
        System.out.print("Prefix expression: ");
        System.out.print(infixToPrefix(s.toCharArray()));
    }
}