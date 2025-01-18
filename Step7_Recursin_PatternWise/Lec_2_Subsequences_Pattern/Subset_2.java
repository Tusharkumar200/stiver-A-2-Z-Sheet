import java.util.HashSet;
import java.util.List;

public class Subset_2 {

    public static void fun(int[] nums, int index, List < Integer > ds, HashSet < String > res) {

        
    }

    public static List < String > subsetsWithDup(int[] nums) {

    }

    static void printAns(List < String > ans) {
        System.out.println("The unique subsets are ");
        System.out.println(ans.toString().replace(",", " "));
    }
    public static void main(String[] args) {
        int nums[]={1,2,2};
        List < String > ans = subsetsWithDup(nums);
        printAns(ans);
    }
}
