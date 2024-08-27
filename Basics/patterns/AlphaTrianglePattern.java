public class AlphaTrianglePattern {
    /*
      Input Format: N = 3
      Result: 
        C
        B C
        A B C
     */
    public static void ATP(int N){

        for(int i=0; i<N; i++){

            for (char ch = (char) ('A' + N - 1); ch >= (char) ('A' + N - 1 - i); ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n =5;
        ATP(n);
    }
}
