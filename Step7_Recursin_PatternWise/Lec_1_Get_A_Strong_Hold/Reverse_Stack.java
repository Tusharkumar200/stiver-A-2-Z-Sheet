package Lec_1_Get_A_Strong_Hold;
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
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        

        System.out.println("Sorted stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
