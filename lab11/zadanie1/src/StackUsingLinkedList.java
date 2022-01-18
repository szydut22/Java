import java.util.LinkedList;

public class StackUsingLinkedList <E>extends LinkedList<E> {
    LinkedList<E> stack = new LinkedList<>();

    public StackUsingLinkedList() {
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public E peek() {
        return stack.peek();
    }

    @Override
    public E pop() {
        return stack.pop();
    }

    @Override
    public void push(E e) {
        stack.push(e);
    }

    @Override
    public int size() {
        return stack.size();
    }

    public void addStackElement(E e) {
        stack.add(e);
    }

    @Override
    public String toString() {
        return "stack=" + stack;
    }

    public LinkedList<E> getStack() {
        return stack;
    }
}
