import java.util.Stack;

class Pair {
    int x, y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Implement_Min_Stack {
    
    
     Stack < Pair > st;
    public Implement_Min_Stack() {
        st = new Stack < > ();
    }

    public void push(int x) {
        int min;
        if(st.isEmpty()){
            min = x;
        }
        else{
            min = Math.min(st.peek().y, x);
        }
            st.push(new Pair(x, min));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().x;
    }
    
    public int getMin() {
        return st.pop().y;
    }

    public static void main(String[] args) {
        
    }
}
