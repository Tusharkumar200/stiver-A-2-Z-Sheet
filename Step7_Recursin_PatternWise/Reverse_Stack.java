import java.util.Stack;

public class Reverse_Stack {
    
    public static void Reverse(Stack<Integer> s){
        if(s.isEmpty())return;
        int top = s.pop();
        Reverse(s);
        insertAtLast(s,top);
    }
    
    public static void main(String[] args) {
        
    }
}
