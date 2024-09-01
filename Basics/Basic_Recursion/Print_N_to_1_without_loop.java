// 10 9 8 7 6 5 4 3 2 1

public class Print_N_to_1_without_loop {

    public static void printN(int n){
        int start = n;
        int end = 1;

        if(end > start) return;

        System.out.print(n + " ");
        n = n-1;
        printN(n);
    }
    public static void main(String[] args) {
        int n = 5;
        printN(n);
    }
}
