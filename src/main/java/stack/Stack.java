package stack;

/**
 * Created by vasudvis on 1/30/2017.
 */
public class Stack<T> {
    private Node<T> head;

    private void push(T value){
        if(this.head == null) {
            this.head = new Node<T>(value, null);
            return;
        }
        this.head = new Node<T>(value, this.head);
    }

    public T pop(){
        if(this.head == null) return null;
        T value = this.head.getValue();
        this.head = this.head.getNext();
        return value;
    }

    public static void main(String args[]){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
