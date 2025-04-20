package Step8_Bit_Manipulation.Lec1_Learn_Bit_Manipulation;

public class odd_even 
{
    public static boolean isEven(int n){

        if((n & 1)== 0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        
        boolean res = isEven(11);
        System.out.println(res);
    }
}
