public class Implement_Stack_using_Arrays {
    

    public static void main(String[] args) {
        stack s = new stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.top());
    }
}

class stack{
    int size = 10000;
    int []arr = new int[size];
    int top = -1;

    void push(int x){

    }
    int pop(){

    }
    int top(){

    }
    int size(){
        
    }

}
