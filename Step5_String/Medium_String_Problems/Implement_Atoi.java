public class Implement_Atoi {

    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        int sign = 1;

        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        long res = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            res = res * 10 + s.charAt(i) - '0';
            if (res * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (res * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (res * sign);
    }

    public static void main(String[] args) {

        Implement_Atoi atoi = new Implement_Atoi();

        String input1 = "42";
        System.out.println("Input: \"" + input1 + "\" -> Output: " + atoi.myAtoi(input1));

        String input2 = "   -42";
        System.out.println("Input: \"" + input2 + "\" -> Output: " + atoi.myAtoi(input2));

        String input3 = "4193 with words";
        System.out.println("Input: \"" + input3 + "\" -> Output: " + atoi.myAtoi(input3));

        String input4 = "words and 987";
        System.out.println("Input: \"" + input4 + "\" -> Output: " + atoi.myAtoi(input4));

        String input5 = "-91283472332";
        System.out.println("Input: \"" + input5 + "\" -> Output: " + atoi.myAtoi(input5));

    }
}
