import java.util.ArrayList;
import java.util.Stack;

public class Next_Smaller_Element {
    
     public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.size(); i++) {
            while (!stack.isEmpty() && stack.peek() >= A.get(i)) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result.add(-1);
            } else {
                result.add(stack.peek());
            }

            stack.push(A.get(i));
        }

        return result;
    }
    public static void main(String[] args) {
        Next_Smaller_Element nse = new Next_Smaller_Element();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(4);
        A.add(5);
        A.add(2);
        A.add(10);
        A.add(8);

        ArrayList<Integer> result = nse.prevSmaller(A);
        System.out.println(result);
    }
}
