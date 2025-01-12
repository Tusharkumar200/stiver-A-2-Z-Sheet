
public class Print_all_subsequences_Power_Set{

    
    public static void subsequences(int i , String s, String f){

        if( i == s.length()){

            System.out.println(f + " ");
            return;
        }

        
    }
    public static void main(String[] args) {
    String s = "abc";
	String f = "";
	System.out.println("All possible subsequences are: ");
	subsequences(0, s, f);
    }
}