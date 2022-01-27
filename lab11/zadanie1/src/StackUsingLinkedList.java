import java.util.LinkedList;

public class StackUsingLinkedList <E>extends LinkedList<E> {
    LinkedList<E> stack = new LinkedList<>();//linkedlista do ktorej dodaje obiekty typu E w naszym przykladzie beda to int i char(string)

    public StackUsingLinkedList() {}//pusty konstruktor

    //metody zaimplementowane wraz z Linkedlist
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

    //dodawanie elementow do linkedlisty
    public void addStackElement(E e) {
        stack.add(e);
    }

    @Override
    public String toString() {
        return "stack=" + stack;
    }

    //metoda zwracajaca linkedliste
    public LinkedList<E> getStack() {
        return stack;
    }
}
