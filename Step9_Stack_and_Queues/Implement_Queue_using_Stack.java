import java.util.Stack;

public class Implement_Queue_using_Stack {
    
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(3);
        q.push(4);
        System.out.println("The element poped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());
    }
}

class MyQueue {
    Stack <Integer> input = new Stack < > ();
    Stack <Integer> output = new Stack < > ();
    
    public void push(int x) {

        while(input.empty() == false){
            output.push(input.peek());
            input.pop();
        }
        System.out.println("The element pushed"+x);
        input.push(x);

        while (output.empty() == false) {
            input.push(output.peek());
            output.pop();
        }
    }

    public int pop() {
        if (input.empty()) {
            System.out.println("Stack is empty");

        }
        int val = input.peek();
        input.pop();
        return val;
    }

    public int peek() {
        if (input.empty()) {
            System.out.println("Stack is empty");

        }
        return input.peek();
    }

    int size() {
        return input.size();
    }
}
