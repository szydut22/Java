package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    //dopisz warunek w ktorym bedziesz sprawdzal czy tablica nie jest cala martwa wtedy koncz dzialanie!

    private static void fill_the_board(int[][] board, int n) { //funkcja sluzaca do rozlokowania komorek zywych i martwych (komorki martwe oznaczaja 0, a komorki zywe 1)
        int start = Math.round((float)((n * n)/3)); //wyliczenie 30% komorek dla podanego rozmiaru planszy
        Random rand = new Random();

        int x = 0;
        int y = 0;
        int counter = 0;

        while(start > counter){//pętla w której rozlokowuje 30% komórek żywych
            x = rand.nextInt(n - 1); //losowanie nr wiersza dla komórki zywej(zakres losowania ustawiam o rozmiar mniejszy od rozmiaru tablicy ponieważ iteruje sie od 0)
            y = rand.nextInt(n - 1); //losowanie nr kolumny dla komórki zywej(zakres losowania ustawiam o rozmiar mniejszy od rozmiaru tablicy ponieważ iteruje sie od 0)

            if(board[x][y] == 0){ //sprawdzam czy dana komórka o wylosowanych wspolrzednych nie jest juz przypadkiem żywa
                board[x][y] = 1; //jezeli nie usatwiam ja jako zywa
                counter++;//zwiekszam counter poniewaz zaalokowalem komorke zywa
            }
        }
    }

    private static void make_cells_alive_or_dead(int[][] board, int n) { //funkcja tworzaca z komorek martwych komorki zywe i na odwrot
        int counter = 0; //counter ktory bedzie sluzyl do sprawdzania ilosci sasiadow zywych na okolo danej komorki
        int[][] boardPom = new int[n][n]; //kopia tablicy board[][] wpisuje do niej komorki zywe i martwe zamiast do board poniewaz gdybym do board wpisal np 1 na pozycje 01 to wtedy mogloby miec to wplyw na to czy komorka 02 bedzie zywa jescze w tym etapie czy tez nie
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){//sprawdzam czy aktualna komorka jest martwa jezeli tak sprawdzam czy nie zostanie ozywiona

                    //przekazuje do checkNeighbors kolejno wspolrzedne sasiadow danej komorki, jezeli sasiad jest zywy i miesci sie w zakresie planszy oczekuje ze counter zwiekszy sie o 1 w przeciwnym wypadku zostanie taki sam

                    counter += checkNeighbors(board,i-1, j);
                    counter += checkNeighbors(board,i-1, j+1);
                    counter += checkNeighbors(board, i, j+1);
                    counter += checkNeighbors(board,i+1, j+1);
                    counter += checkNeighbors(board,i+1, j);
                    counter += checkNeighbors(board,i+1, j-1);
                    counter += checkNeighbors(board, i, j-1);
                    counter += checkNeighbors(board,i-1, j-1);

                    if (counter == 3) { //sprawdzam czy komorka ma dokladnie 3 zywych sasiadow jezeli tak to ustawiam ja w aktualnej kopii tablicy na 1
                        boardPom[i][j] = 1;
                    }
                }

                if(board[i][j] == 1){ // jezeli komorka jest zywa sprawdzamy czy nie stanie sie martwa

                    //przekazuje do checkNeighbors kolejno wspolrzedne sasiadow danej komorki, jezeli sasiad jest zywy i miesci sie w zakresie planszy oczekuje ze counter zwiekszy sie o 1 w przeciwnym wypadku zostanie taki sam

                    counter += checkNeighbors(board,i-1, j);
                    counter += checkNeighbors(board,i-1, j+1);
                    counter += checkNeighbors(board, i, j+1);
                    counter += checkNeighbors(board,i+1, j+1);
                    counter += checkNeighbors(board,i+1, j);
                    counter += checkNeighbors(board,i+1, j-1);
                    counter += checkNeighbors(board, i, j-1);
                    counter += checkNeighbors(board,i-1, j-1);

                    if (counter < 2 || counter > 3) {// sprawdzam czy liczba sasiadow jest mniejsza niz 2 lub wieksza niz 3 w takim wypadku komorka staje sie martwa z powodu malej ilosci sasiadow lub z zatloczenia
                        boardPom[i][j] = 0;
                    }else{// w przeciwnym wypadku zostaje zywa
                        boardPom[i][j] = 1;
                    }
                }
                counter = 0;
            }
        }

        for(int i = 0; i < n; i++){// przepisywanie pol z kopii planszy na pierwotna plansze
            for(int j = 0; j < n; j++){
                board[i][j] = boardPom[i][j];
            }
        }
    }

    private static int checkNeighbors(int[][] board, int i, int j){//funkcja sluzaca ktora zwraca 1 jezeli sasiad jest zywy i wspolrzedne sasiada nie wyszly poza zakres planszy
        try{
            if(board[i][j] == 1){//sprawdzam czy sasiad jest zywy czy martwy
                return 1;
            }else{
                return 0;
            }

        }catch(ArrayIndexOutOfBoundsException e){}//ArrayIndexOutOfBoundsException ma za zadanie sprawdzac obsluzyc wyjatek kiedy wspolrzedne wyszly poza zakres planszy do gry
        return 0;
    }

    private static void printTab(int[][] board, int n){// funkcja sluzaca do wypisania calej tablicy
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){ //głowna funkcja
        Scanner s = new Scanner(System.in);

        System.out.println("Podaj wymiar tablicy");
        int n = s.nextInt();

        System.out.println("Wprowadz odstep czasowy z jakim maja wyswietlac sie plansze (czas podaj w sekundach)");
        int durations = s.nextInt();

        int[][] board = new int[n][n]; //deklaracja tablicy 2d ktora ma odpowiadac naszej planszy

        //tutaj jest czesc w ktorej wyswietlam nowo powstala tablice w okreslonym(podanym powyzej odstepie czasu "durations")
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 0; // counter posluzył mi do wyswietlania kolejnych etapów/zmian zachodzacych na planszy

            @Override
            public void run() {
                if (counter == 0) {//1 etap: wypisuje sobie tutaj poczatkową tablice która wypełniona jest całkowicie komórkami martwymi i zwiekszam counter o 1 aby przejsc do kolejnego "etapu"
                    printTab(board, n);
                    System.out.println();
                    counter++;
                } else if (counter == 1) {//2 etap: za pomocą  fill_the_board() wypełniam zapełniam plansze w 30% komórkami żywymi, potem wyświetlam tą tablicę, plus zwiększam counter i przechodze do kolejnego "etapu"
                    fill_the_board(board, n);
                    printTab(board, n);
                    System.out.println();
                    counter++;
                } else if (counter > 1) {//3 i ostatni etap, który wykonywać będzie sie juz do końca: w tym etapie za pomocą make_cells_alive_or_dead() ożywamy komórki które maja co najmniej 3 sasiadów, ale również zmieniamy komórki zywe na martwe gdy maja mniej niz 2 sasiadow lub wiecej niz 3
                    make_cells_alive_or_dead(board, n);
                    printTab(board, n);
                    System.out.println();
                }
            }
        };

        timer.schedule(task, 0, durations * 1000); //"zarządzca czasowy" ma za zadanie wyświetlać wyżej wymienione etapy w określonych odstępach czasowych durations mnozymy *1000 aby powstaly nam sekundy
    }
}

