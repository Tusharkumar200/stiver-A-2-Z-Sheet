
public class printingSquarStar{

    public static void printStar(int num){
        for(int i = 0; i <num; i++){
            for(int j = 0; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printStar(5);
    }
}
