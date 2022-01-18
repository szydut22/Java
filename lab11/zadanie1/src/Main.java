import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int number;
        char character;
        ArrayList<StackUsingLinkedList<Integer>> listInt = new ArrayList<>();
        ArrayList<StackUsingLinkedList<Character>> listChar = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            number = s.nextInt();
            listInt.add(new StackUsingLinkedList<>(number));
        }

        System.out.println("podaj char");
        for(int i = 0; i < 5; i++) {
            character = s.next().charAt(0);
            listChar.add(new StackUsingLinkedList<>(character));
        }

    }

    private static <E> void printStack(StackUsingLinkedList<E> stack){
        for(E x: stack){
            System.out.println(x);
        }
    }

    private static <E extends Number> void sumSquares(StackUsingLinkedList<E> stack){

    }

    private static <E extends CharSequence> void toUpper(StackUsingLinkedList<E> stack){

    }

}
