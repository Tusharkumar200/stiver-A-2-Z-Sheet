
class Infix_to_prefix{
    
    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
    static String infixToPrefix(String exp) {

    }
    public static void main(String[] args){

    }
}