import java.util.Arrays;

public class Second_Largest {

    public static void main(String[] args) {
        int arr[] = {12, 85, 1, 10, 81, 1};

        // int max = arr[0];
        // int count = 0;

        // for(int i=0; i<arr.length; i++){

        //     if(arr[i] > max){
        //         count = count+1;
        //         max = arr[i];
        //     }
            
        // }
        // max = arr[count];
        // System.out.println("prev step "+ max);
        // System.out.println("MAX "+max);
        // System.out.println("Count "+count);

        Arrays.sort(arr);
        int lasttwoelement = arr[arr.length-2];
        System.out.println(lasttwoelement);

    }
}
