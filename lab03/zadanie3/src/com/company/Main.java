package com.company;
import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int m, int n){
        System.out.print("Liczby pierwsze z przedzialu od " +m+ " do " +n+ " to: ");
        for(int i = m; i < n; i++){
            if(isPrime(i) == true){
                System.out.print(i+ ", ");
            }
        }
        System.out.println();
        System.out.println("łącznie jest ich: " +numPrimes(m,n));
    }

    public static int numPrimes(int m, int n){
        int counter = 0;
        for(int i = m; i < n; i++){
            if(isPrime(i) == true){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        printPrimes(50,150);
    }
}
