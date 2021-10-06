package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int counter = 0;

        System.out.print("od 1 do 50 jest ");
        for(int i = 1; i < 50; i++) {
            if(i % 3 == 0 && i % 7 != 0){
                counter++;
            }
        }
        System.out.println(counter+ " liczb");
        counter = 0;

        System.out.print("od 51 do 100 jest ");
        for(int i = 51; i < 100; i++) {
            if(i % 3 == 0 && i % 7 != 0){
                counter++;
            }
        }

        System.out.println(counter+ " liczb");
        counter = 0;

        System.out.print("od 101 do 150 jest ");
        for(int i = 101; i < 150; i++) {
            if(i % 3 == 0 && i % 7 != 0){
                counter++;
            }
        }
        System.out.println(counter+ " liczb");

    }
}
