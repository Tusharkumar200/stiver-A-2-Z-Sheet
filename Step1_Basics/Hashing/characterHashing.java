import java.util.Scanner;

public class characterHashing {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            String s;
            s= sc.next();

            // PreCompute

            int [] hash = new int[26];

            for(int i =0; i< s.length(); i++){
                hash[s.charAt(i) - 'a']++;

            }

            int q;
            q= sc.nextInt();
            while(q-- > 0){
                char c;
                c= sc.next().charAt(0);
                // Fetching...
                System.out.println(hash[c- 'a']);
            }
            
        }
    }
}
