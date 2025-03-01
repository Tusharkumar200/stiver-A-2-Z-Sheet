import java.util.HashMap;
import java.util.Map;

class Node {
    Node prev, next;
    int key, value;
    Node(int _key, int _value) {
        key = _key;
        value = _value;
    }
}

public class LRUCache{
    Node head = new Node(0, 0), tail = new Node(0, 0);
    Map < Integer, Node > map = new HashMap();
    int capacity;

    public LRUCache(int _capacity) {
        capacity = _capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {

    }

    public void put(int key, int value) {

    }

    private void remove(Node node) {

    }

    private void insert(Node node) {
        
    }
}