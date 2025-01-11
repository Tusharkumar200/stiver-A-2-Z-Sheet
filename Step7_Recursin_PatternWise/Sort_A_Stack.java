package Lec_1_Get_A_Strong_Hold;
import java.util.Stack;

public class Sort_A_Stack {
    
    public static void sortedInsert(Stack<Integer> stack, int key)  
    { 
        if(stack.isEmpty() || key > stack.peek()){
            stack.push(key);
            return;
        }

        int top = stack.pop();
        sortedInsert(stack, key);
        stack.push(top);
     }

    public  Stack<Integer> sort(Stack<Integer> s) {
        if(s.empty()){
            return s;
        }
        int top = s.pop();
        sort(s);
        sortedInsert(s, top);
         return s;
        
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        Sort_A_Stack sorter = new Sort_A_Stack();
        stack = sorter.sort(stack);

        System.out.println("Sorted stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
