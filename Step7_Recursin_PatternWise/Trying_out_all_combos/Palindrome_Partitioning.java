import java.util.List;

public class Palindrome_Partitioning {
    
    public static List < List < String >> partition(String s) {

    }

    
    static void partitionHelper(int index, String s, List < String > path, List < List < String >> res) {

    }

    static boolean isPalindrome(String s, int start, int end) {

    }

    public static void main(String[] args) {
        String s = "aabb";
        List < List < String >> ans = partition(s);
        int n = ans.size();
        System.out.println("The Palindromic partitions are :-");
        System.out.print(" [ ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("[ ");
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.print("] ");
        }
        System.out.print("]");
    }
}
