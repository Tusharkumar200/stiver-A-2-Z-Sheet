import java.util.Stack;

public class Reverse_Stack {
    
    public static void Reverse(Stack<Integer> s){
        if(s.isEmpty())return;
        int top = s.pop();
        Reverse(s);
        insertAtLast(s,top);
    }
    public static void insertAtLast(Stack<Integer> stack , int elem){

        if(stack.isEmpty()){
            stack.push(elem);
            return;
        }
        int topElem = stack.pop();
        insertAtLast(stack, topElem);
        stack.push(topElem);
    }
    public static void main(String[] args) {
        
    }
}
