package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Podaj rozmiar tablicy N: ");
        int N = s.nextInt();

        int[] t1 = new int[N];

        for(int i = 0; i < N; i++){
            t1[i] = rand.nextInt(112 - 55 + 1) + 55;
        }
        int size = (N + 1) / 2;
        int counter = 0;
        int[] t2 = new int[size];

        for(int j = 0; j < N; j += 2){
            if(j+1 == N){
                t2[counter] = t1[j];
            }else {
                t2[counter] = (t1[j] + t1[j + 1]) / 2;
            }
            counter++;
        }

        System.out.print("tab1: ");
        for(int x = 0; x < N; x++){
            System.out.print(t1[x]+ ", ");
        }

        System.out.println();

        System.out.print("tab2: ");
        for(int y = 0; y < size; y++){
            System.out.print(t2[y]+ ", ");
        }

    }
}
