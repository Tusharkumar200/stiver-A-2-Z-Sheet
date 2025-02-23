import java.util.Stack;

public class Stock_span_problem {
    
    Stack<int[]> s;

    public Stock_span_problem(){
        s= new Stack<>();
    }

    public int next(int price){
        int span =1;
        while(!s.isEmpty() && price >= s.peek()[0]){
            span += s.peek()[1];
            s.pop();
        }
        s.push(new int[]{price, span});
        return span;
    }
    public static void main(String[] args) {
        
    }
}
