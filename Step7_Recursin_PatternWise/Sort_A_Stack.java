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

    public Stack<Integer> sort(Stack<Integer> s) {
        
    }
    public static void main(String[] args) {
        
    }
}
