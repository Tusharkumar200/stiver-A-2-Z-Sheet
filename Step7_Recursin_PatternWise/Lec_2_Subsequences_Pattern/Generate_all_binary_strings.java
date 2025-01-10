package Lec_2_Subsequences_Pattern;

public class Generate_all_binary_strings {
    
    static void All_Binary_Strings(String str, int num)
    {
        int len = str.length();

        if(len == num){
            System.out.println(str + " ");
            return;
        }
        else if(str.charAt(len-1)== '1'){
            All_Binary_Strings(str +" 0", num);
        }
        else{
            All_Binary_Strings(str + '0', num);
            All_Binary_Strings(str + '1', num);
        }
    }

    static void print(int num)
    {

    }
    public static void main(String[] args) {
        int n = 4;
        print(n);
    }
}
