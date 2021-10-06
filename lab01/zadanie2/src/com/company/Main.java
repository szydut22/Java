package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	    double sum = 0, harmonic;
	    System.out.println("Z ilu liczb chcesz policzyc srednia harmoniczna: ");
	    int n = s.nextInt();

        System.out.println("Z jakich liczb chcesz policzyc srednia harmoniczna: ");

        for(int i = 0; i < n; i++) {
            double num = s.nextDouble();
            sum += 1/num;
        }

        harmonic = n/sum;

        System.out.println("oto twoja srednia harmoniczna: " +harmonic);
    }
}
