package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ile liczb chcesz podac: ");
        int size = s.nextInt();
        int[] tab = new int[size];
        int min = tab[0];
        int max = tab[0];

        System.out.println("Podaj liczby");

        for(int i = 0; i < size; i++){
            int number = s.nextInt();
            tab[i] = number;
        }

        for(int i = 0; i < size; i++){
            if(tab[i] < min){
                min = tab[i];
            }
        }

        for(int i = 0; i < size; i++){
            if(tab[i] > max){
                max = tab[i];
            }
        }
        System.out.println("Twoje min to: " +min);
        System.out.println("Twoje max to: " +max);
    }
}