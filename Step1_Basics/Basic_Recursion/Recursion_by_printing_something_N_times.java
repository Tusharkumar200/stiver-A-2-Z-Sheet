
class Recursion_by_printing_something_N_times{

    static int cnt = 0;

    public static void Print(){

        // Base condition
        if(cnt ==3) return ;
        System.out.println(cnt);
        cnt = cnt + 1;
        Print();
    }
    public static void main(String[] args) {
        Print();
    }
}