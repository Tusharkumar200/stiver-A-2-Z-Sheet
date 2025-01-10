package Lec_1_Get_A_Strong_Hold;

public class String_to_Integer {

    public static int myAtoi(String s) {
        String string = s.trim();

       // handle empty string
       if (string.isEmpty())
           return 0;

       int i = 0;
       boolean isNegative = false;

       // step 2: check for - or + sign
       if (string.charAt(i) == '-') {
           isNegative = true;
           i++;
       } else if (string.charAt(i) == '+') {
           i++;
       }

       // step 3: convert string to number
       int result = 0;
       while (i < string.length()) {
           char c = string.charAt(i);
           if (c < '0' || c > '9') {
               break;
           }
           int digit = c - '0';

           // step 4: check overflow
           if (result > Integer.MAX_VALUE / 10
                   || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10))
               return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;

           result = result * 10 + digit;
           i++;
       }
       return isNegative ? -result : result;
   }
    
    public static void main(String[] args) {
        String input = "-1234"; // Example input
        int result = myAtoi(input);
        
        System.out.println("Converted Integer: " + result);
    }
}
