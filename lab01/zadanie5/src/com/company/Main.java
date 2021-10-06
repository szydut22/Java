package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

        boolean automorficzna;
	    System.out.println("Sprawdz czy twoja liczba jest liczba automorficzna: ");
	    int num = s.nextInt();

	    automorficzna = czyAutomorficzna(num);

	    if(automorficzna == true){
            System.out.println("Twoja liczba jest automorficzna");
        }else{
            System.out.println("Twoja liczba nie jest automorficzna");
        }
    }

    static int wielkosc(int num){
        int counter = 0;
        while(num > 0){
            counter++;
            num /= 10;
        }
        return counter;
    }

    static boolean czyAutomorficzna(int num){
        int kwadrat = num * num;
        int size = wielkosc(num);

        if(kwadrat % Math.pow(10, size) == num) {
            return false;
        } else {
            return true;
        }
    }
}
