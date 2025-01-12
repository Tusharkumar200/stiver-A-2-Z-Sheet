package Lec_2_Subsequences_Pattern;
public class Print_all_subsequences_Power_Set{

    
    public static void subsequences(int i , String s, String f){

        if( i == s.length()){

            System.out.print(f + " ");
            return;
        }

        subsequences(i+1,s,f+s.charAt(i));

        subsequences(i+1, s, f);
    }
    public static void main(String[] args) {
    String s = "abc";
	String f = "";
	System.out.println("All possible subsequences are: ");
	subsequences(0, s, f);
    }
}