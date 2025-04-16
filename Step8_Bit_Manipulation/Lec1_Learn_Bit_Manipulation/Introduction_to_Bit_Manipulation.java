package Step8_Bit_Manipulation.Lec1_Learn_Bit_Manipulation;


// bitwise operators



public class Introduction_to_Bit_Manipulation {
    
    public static void bitwiseOperator(){
        int a = 5; 
        int b = 3;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a << b);
    }
    public static void main(String[] args) {
        bitwiseOperator();
    }
}
