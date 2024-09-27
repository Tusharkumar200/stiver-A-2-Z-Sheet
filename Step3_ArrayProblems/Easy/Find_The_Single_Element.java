package Easy;

public class Find_The_Single_Element {
    

    public static int findSingle(int arr[]){

        int  single = 0;

        for(int i: arr) single = single ^ i;
        return single;
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 1, 2,8, 3, 3, 4, 4};
        int result = findSingle(arr);
        System.out.println(result);
    }
}
