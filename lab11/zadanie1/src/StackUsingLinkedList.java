import java.util.LinkedList;

public class StackUsingLinkedList <E> extends LinkedList<E>{
    private E e;

    public StackUsingLinkedList(E type) {
        this.e = type;
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public E peek() {
        return super.peek();
    }

    @Override
    public E pop() {
        return super.pop();
    }

    @Override
    public void push(E e) {
        super.push(e);
    }

    @Override
    public int size() {
        return super.size();
    }
}
