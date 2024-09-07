import java.util.Scanner;

public class hashingTest{

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int []arr = new int[n];

            for(int i =0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            // preCompute

            int[] hash = new int[13];

            for(int i =0; i<n; i++){
                hash[arr[i]] +=1;
            }

            int q;
            q = sc.nextInt();
            while(q-- !=0){
                int num;
                num = sc.nextInt();

                // fetching...
                System.out.println(hash[num]);
            }
        }
        
    }
}