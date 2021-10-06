package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Podaj ilosc liczb ktore chcesz wprowadzic");
        int size = s.nextInt();
        int[] tab = new int[size];

        System.out.println("Wprowadz swoje liczby: ");
        for(int i = 0; i < size; i++) {
            int n = s.nextInt();
            tab[i] = n;
        }

        int min = tab[0];
        int max = tab[0];

        for(int i = 0; i < size; i++) {
            if(tab[i] < min){
                min = tab[i];
            }
            if(tab[i] > max){
                max = tab[i];
            }
        }

        System.out.println("Min z twoich liczb to: " +min);
        System.out.println("Max z twoich liczb to: " +max);
    }
}
