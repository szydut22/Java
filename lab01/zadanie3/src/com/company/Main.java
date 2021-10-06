package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj liczbe z ktorej ma byc zrobiona silnia");
        int num = s.nextInt();
        int silniaI;
        int silniaR;

        silniaI = silniaIter(num);
        silniaR = silniaRekur(num);

        System.out.println("silnia wyliczona iteracyjnie to: " +silniaI);
        System.out.println("silnia wyliczona iteracyjnie to: " +silniaR);

    }

    static int silniaIter(int num){
        int silnia = 1;
        for(int i = 1; i <= num; i++) {
            silnia *= i;
        }
        return silnia;

    }

    static int silniaRekur(int num){
        if(num == 0){
            return 1;
        }
        return (num * silniaRekur(num-1));
    }
}
