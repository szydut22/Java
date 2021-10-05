package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

	    System.out.println("Wprowadz liczbe całkowita n: ");
	    int n = s.nextInt();

        System.out.println("Podzielniki twojej liczby n to: ");
	    for(int i = 1; i <= n; i++) {
	        if(n%i == 0){
                System.out.println(i);
            }
        }


    }
}
