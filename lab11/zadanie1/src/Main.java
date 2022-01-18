import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int number;
        String character;

        StackUsingLinkedList<Integer> stackInt = new StackUsingLinkedList<>();
        StackUsingLinkedList<String> stackCharacter = new StackUsingLinkedList<>();

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            number = s.nextInt();
            stackInt.addStackElement(number);
        }

        System.out.println("Podaj char");

        for(int i = 0; i < 5; i++) {
            character = s.next();
            stackCharacter.addStackElement(character);
        }

        //1 czesc dla inta
        printStack(stackInt);
        System.out.println(stackInt.isEmpty());
        System.out.println(stackInt.size());
        System.out.println(stackInt.peek());
        printStack(stackInt);
        stackInt.push(16);
        printStack(stackInt);
        System.out.println(stackInt.pop());
        printStack(stackInt);

        //1 czesc dla character
        printStack(stackCharacter);
        System.out.println(stackCharacter.isEmpty());
        System.out.println(stackCharacter.size());
        System.out.println(stackCharacter.peek());
        printStack(stackCharacter);
        stackCharacter.push("k");
        printStack(stackCharacter);
        System.out.println(stackCharacter.pop());
        printStack(stackCharacter);

        //metody
        System.out.println("Metody");
        printStack(stackInt);
        printStack(stackCharacter);

        sumSquares(stackInt);
        toUpper(stackCharacter);
    }

    private static <E> void printStack(StackUsingLinkedList<E> stack){
        System.out.println(stack.toString());
    }

    private static <E extends Number> void sumSquares(StackUsingLinkedList<E> stack){
        for(E e: stack.getStack()){
            System.out.println(Math.pow(e.intValue(),2));
        }
    }

    private static <E extends CharSequence> void toUpper(StackUsingLinkedList<E> stack){
        for(E e: stack.getStack()){
            System.out.println(e.toString().toUpperCase());
        }
    }

}
