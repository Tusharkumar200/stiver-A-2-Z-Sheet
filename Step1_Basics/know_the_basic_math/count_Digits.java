

public class count_Digits {

    public static int countDigits(int n){

        // int count = 0;
        // n --> 12345
         
        // while(n>0){
        //     n = n/10;
        //     count =count +1;
            
        // }
        // System.out.println(count);

    //  Optimal Approach
    
        // int cnt = (int) (Math.log10(n)+1);
        // System.out.println(cnt);

        int count = 0;
        int originalNumber = n;

        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && originalNumber % digit == 0) {
                count++;
            }
            n /= 10;
        }

        return count;
        
    }

    public static void main(String[] args){

        int n = 1234567890;
        countDigits(n);

        int result = countDigits(n);
        System.out.println(result);
        
    }
}