package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    private static void fill_the_board_with_zeroes(int[][] board, int n) {// funkcja wypelniajaca tablice 2d zerami
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 0;
            }
        }
    }

    private static void fill_the_board(int[][] board, int n) { //funkcja sluzaca do rozlokowania komorek zywych i martwych
        int start = Math.round((float)((n * n)/3));
        int[][] tabPom = new int[start][1];
        Random rand = new Random();
        int nowoWylosowana = 0;
        int x = 0;
        int y = 0;

        int i = 0;
        int c = 0;

        for(;;) {
            if(c < start){
                int counter = 0;
                x = rand.nextInt(n);
                y = rand.nextInt(n);
                nowoWylosowana = (x * 10) + y;
                tabPom[c][0] = nowoWylosowana;
                if (c > 0) {
                    for (int j = 0; j < c; j++) {
                        if (nowoWylosowana == tabPom[j][0]) {
                            counter++;
                        }
                    }
                }
                if (counter == 0) {
                    board[x][y] = 1;
                    c++;
                }
            }else{
                break;
            }
        }
    }

    private static void make_cells_alive(int[][] board, int n){ //funkcja tworzaca z komorek martwych komorki zywe
        int counter;
        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                for(int i = x; i < n; i++){
                    for(int j = y; j < n; j++){
                        if(board[i-1][j] == 1){

                        }
                        if(board[i-1][j+1] == 1){

                        }
                        if(board[i][j+1] == 1){

                        }
                        if(board[i+1][j+1] == 1){

                        }
                        if(board[i+1][j] == 1){

                        }
                        if(board[i+1][j-1] == 1){

                        }
                        if(board[i][j-1] == 1){

                        }
                        if(board[i+1][j-1] == 1){

                        }
                    }
                }
            }
        }
    }

    private static void make_cells_dead(int[][] board, int n) { //funkcja sluzaca do zmiany komorek zywych w martwe gdy maja mniej lub wiecej niz 2 lub 3 sasiadow
    }

    private static void printTab(int[][] board, int n){// funkcja sluzaca do wypisania calej tablicy
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) { //głowna funkcja: deklaracja tablicy 2d
        Scanner s = new Scanner(System.in);

        System.out.println("Podaj wymiar tablicy");
        int n = 3;

        int[][] board = new int[n][n];
        int nn = (n*10)+n;



        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 0;
            @Override
            public void run() {
                if(counter == 0){
                    fill_the_board_with_zeroes(board, n);
                    printTab(board, n);
                    counter++;
                }else if(counter == 1){
                    fill_the_board(board, n);
                    printTab(board, n);
                    counter++;
                }else if(counter > 1){

                }
            }
        };

        timer.schedule(task, 0, 2*1000);
    }






}
