package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
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

    private static void make_cells_alive(int[][] board, int n) { //funkcja tworzaca z komorek martwych komorki zywe
        int counter = 0;
        int[][] boardPom = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){
                    if( i >= 1 && board[i - 1][j] == 1){
                        counter++;
                    }
                    if(i - 1 >= 0 && j + 1 <= n && board[i - 1][j + 1] == 1) {
                        counter++;
                    }
                    if(j + 1 <= n && board[i][j + 1] == 1) {
                        counter++;
                    }
                    if(i + 1 <= n && j + 1 <= n && board[i + 1][j + 1] == 1) {
                        counter++;
                    }
                    if(i + 1 <= n && board[i + 1][j] == 1) {
                        counter++;
                    }
                    if(i + 1 <= n && j - 1 >= 0 && board[i + 1][j - 1] == 1) {
                        counter++;
                    }
                    if(j - 1 >= 0 && board[i][j - 1] == 1) {
                        counter++;
                    }
                    if(i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1] == 1) {
                        counter++;
                    }

                    if (counter == 3) {
                        boardPom[i][j] = 1;
                        counter = 0;
                    }
                }
                if(board[i][j] == 1){ // jezeli komorka jest zywa i sprawdzamy czy nie zmieni sie w martwa
                    if( i >= 1 && board[i - 1][j] == 1){
                        counter++;
                    }
                    if(i - 1 >= 0 && j + 1 <= n && board[i - 1][j + 1] == 1) {
                        counter++;
                    }
                    if(j + 1 <= n && board[i][j + 1] == 1) {
                        counter++;
                    }
                    if(i + 1 <= n && j + 1 <= n && board[i + 1][j + 1] == 1) {
                        counter++;
                    }
                    if(i + 1 <= n && board[i + 1][j] == 1) {
                        counter++;
                    }
                    if(i + 1 <= n && j - 1 >= 0 && board[i + 1][j - 1] == 1) {
                        counter++;
                    }
                    if(j - 1 >= 0 && board[i][j - 1] == 1) {
                        counter++;
                    }
                    if(i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1] == 1) {
                        counter++;
                    }
                    if (counter < 2 || counter > 3) {
                        boardPom[i][j] = 1;
                    }else{
                        boardPom[i][j] = 0;
                    }
                    counter = 0;
                }
            }
        }
        printTab(boardPom, n);
    }

    private static void printTab(int[][] board, int n){// funkcja sluzaca do wypisania calej tablicy
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){ //głowna funkcja: deklaracja tablicy 2d
        Scanner s = new Scanner(System.in);

        System.out.println("Podaj wymiar tablicy");
        int n = 3;

        int[][] board = new int[n][n];
        int nn = (n * 10) + n;
        fill_the_board(board, n);
        printTab(board, n);
        System.out.println();
        make_cells_alive(board, n);



//            Timer timer = new Timer();
//            TimerTask task = new TimerTask() {
//                int counter = 0;
//
//                @Override
//                public void run() {
//                    if (counter == 0) {
//                        printTab(board, n);
//                        counter++;
//                    } else if (counter == 1) {
//                        fill_the_board(board, n);
//                        printTab(board, n);
//                        counter++;
//                    } else if (counter > 1) {
//                        make_cells_alive(board, n);
//                        printTab(board, n);
//                    }
//                }
//            };

//            timer.schedule(task, 0, 2 * 1000);
    }
}

