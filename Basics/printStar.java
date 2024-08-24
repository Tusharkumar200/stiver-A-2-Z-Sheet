
/*
* 
* * 
* * * 
* * * * 
* * * * *
 */



public class printStar {
    public static void printStarsol(int num){


        for(int row=0; row<num; row++){
            for(int col=0; col<=row;col++){
                System.out.print("* ");
            
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int nums = 5;
        printStarsol(nums);
    }
}
