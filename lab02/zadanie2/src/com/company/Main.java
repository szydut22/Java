package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Wprowadz n: ");
        int n = s.nextInt();

        for(int i = 0; i < 10; i++) {
            System.out.print(i + ": ");
            int losowanie = rand.nextInt( 10 - 0 + 1) + 0;
            n -= losowanie;

            if(n == 0 || n < 0){
                for(int j = 0; j < n; j++){
                    System.out.print("*");
                }
            }else{
                for(int k = 0; k < losowanie; k++){
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}
