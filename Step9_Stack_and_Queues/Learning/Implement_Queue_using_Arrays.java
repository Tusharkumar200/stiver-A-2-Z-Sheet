
class Implement_Queue_using_Arrays{



    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}

class Queue{
    private int arr[];
    private int start, end, currSize, maxSize;
    public Queue() {
        arr = new int[16];
        start = -1;
        end = -1;
        currSize = 0;
    }
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        start = -1;
        end = -1;
        currSize = 0;
    }

    void push(int x){
        if( currSize == maxSize){
            System.out.println("Queue is full");
            System.exit(1);
        }
        if(end == -1){
            start =0;
            end =0;
        }
        else{
            end = (end +1) % maxSize;
        }
        arr[end] = x;
        System.out.println("The element pushed is: "+x);
        currSize++;
    }

    int pop(){
        if(start == -1){
            System.out.println("Queue Empty");
            System.exit(1);
        }
        int popped = arr[start];
        if(currSize == 1){
            start = -1;
            end = -1;
        }
        else{
            start = (start +1) % maxSize;
        }
        currSize--;
        return popped;
    }

    int top(){
        if(maxSize == 0){
            return 0;
        }
        return arr[start];
    }
    int size(){
        return currSize;
    }
}