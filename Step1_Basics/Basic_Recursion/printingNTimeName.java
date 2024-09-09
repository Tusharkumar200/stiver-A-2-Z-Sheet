public class printingNTimeName {

    public static void printName(int n){
        PrintHelp(1, n);
    }

    public static void PrintHelp(int i , int n){

        if(i > n) return;
        String name = "Tushar ";
        System.out.print(name);
        PrintHelp(i+1 , n);
    }
    public static void main(String[] args) {
        int n = 5;
        printName(n);
    }
}
