package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static void losowanie(int t[][], int MAX){
        Random rand = new Random();

        for(int i = 0; i < MAX; i++){
            for(int j = 0; j < MAX; j++){
                t[i][j] = rand.nextInt(10);
            }
        }
    }
    private static void wypisywanie(int t[][], int MAX){
        for(int i = 0; i < MAX; i++){
            for(int j = 0; j < MAX; j++){
                System.out.print(t[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void przekatne(int t[][], int MAX){

        int size = 2;
        int[] suma = new int [size];

        for(int i = 0; i < MAX; i++){
            int aktualmin = i;
            for(int j = 0; j < MAX; j++){
                if(aktualmin == j){
                    suma[0] += t[i][j];
                }
            }
        }
        int aktualmax = MAX-1;
        for(int i = 0; i < MAX; i++){
            for(int j = aktualmax; j >= 0; j--){
                if(aktualmax == j){
                    suma[1] += t[i][j];
                }
            }
            aktualmax--;
        }

        for(int i = 0; i < size; i++){
            System.out.println("Suma liczb z przekatnej nr" +(i+1)+ ": " +suma[i]);
        }
        System.out.println();
    }

    private static void sumaBokow(int t[][], int MAX){
        int suma = 0;

        for(int i = 0; i < MAX; i++){
            for(int j = 0; j < MAX; j++){
                if(i == 0 || i == (MAX - 1)){
                    suma += t[i][j];
                }else{
                    if(j == 0){
                        suma += t[i][j];
                    }
                    if(j == (MAX - 1)){
                        suma += t[i][j];
                    }
                }
            }
        }
        System.out.println("Suma liczb na obrzeżu tablicy: " +suma);
        System.out.println();
    }

    private static void minMaxWierszy(int t[][], int MAX){
        int[] min = new int[2];
        int[] max = new int[2];

        min[0] = t[0][0];
        max[0] = t[0][0];

        for(int i = 0; i < MAX; i++){
            for(int j = 0; j < MAX; j++){
                if(t[i][j] > max[0]){
                    max[0] = t[i][j];
                    max[1] = i;
                }
                if(t[i][j] < min[0]){
                    min[0] = t[i][j];
                    min[1] = i;
                }
            }
        }
//        max
        System.out.println("Najwieksza wartosc: " +max[0]+ ", ma wiersz nr " +max[1]);

//        min
        System.out.println("Najmniejsza wartosc: " +min[0]+ ", ma wiersz nr " +min[1]);
        System.out.println();
    }

    private static void czyNieparzysta(int t[][], int MAX){
        int counter = 0;

        for(int i = 0; i < MAX; i++){
            for(int j = 0; j < MAX; j++){
                if(t[i][j] % 2 != 0){
                    counter++;
                }
            }
            if(counter > 0){
                System.out.println("W wierszu nr " +(i+1)+ ": Wystepuje " +counter+ " liczb nieparzystych");
            }else{
                System.out.println("W wierszu nr " +(i+1)+ ": Nie wystepuja liczby nieparzyste");
            }
        }
        System.out.println();
    }

    private static void czyParzyste(int t[][], int MAX){
        int counter = 0;

        for(int i = 0; i < MAX; i++){
            for(int j = 0; j < MAX; j++){
                if(t[i][j] % 2 == 0){
                    counter++;
                }
            }
            if(counter == MAX){
                System.out.println("Wiersz nr " +(i+1)+ ": Składa się wyłącznie z liczb parzystych");
            }else{
                System.out.println("Wiersz nr " +(i+1)+ ": zawiera nie tylko liczby parzyste ale również liczby nieparzyste");
            }
        }
        System.out.println();
    }

    private static void czyWierszRownyKolumnie(int t[][], int MAX){
        int[] sumaW = new int[MAX];
        int[] sumaK = new int[MAX];

        for(int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                sumaW[i] += t[i][j];
                sumaK[j] += t[i][j];
            }
        }

        for(int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                if(sumaK[j] == sumaW[i]){
                    System.out.println("Suma liczb z kolumny nr " +(j+1)+ " jest rowna sumie liczb z kolumny nr " +(i+1));
                }
            }
        }
        System.out.println();
    }

    private static void maxSumaSasiadow(int t[][], int MAX){
        int maxSuma = 0;
//        suma patrzac po sasiednich elementach wierszy
        for(int i = 0; i < MAX; i++){
            for(int j = 0; j < MAX; j++){
                if(j != (MAX-1)){
                    if(t[i][j] + t[i][j+1] > maxSuma){
                        maxSuma = t[i][j] + t[i][j+1];
                    }
                }
            }
        }
//        suma patrzac po sasiednich elementach kolumn
        for(int i = 0; i < MAX; i++){
            for(int j = 0; j < MAX; j++){
                if(i != (MAX-1)){
                    if(t[i][j] + t[i+1][j] > maxSuma){
                        maxSuma = t[i][j] + t[i+1][j];
                    }
                }
            }
        }
        System.out.println("Maksymalna suma dwoch sasiednich elementow wynosi: " + maxSuma);
        System.out.println();
    }

    private static void czyUnikalne(int t[][], int MAX){
        int unikalne = 0;
        int counter = 0;
        int size = MAX*MAX;

        for(int i = 0; i < MAX; i++){
            for(int j = 0; j < MAX; j++) {
                for(int k = i; k < MAX; k++) {
                    for(int l = j; l < MAX; l++){
                        if(t[i][j] == t[k][l]){
                            counter++;
                        }
                    }
                }
                if(counter == 1){
                    unikalne++;
                }

                counter = 0;
            }
        }
        if (unikalne < size) {
            System.out.println("Nie wszystkie elementy w tablicy sa rozne");
        }

        System.out.println("W tablicy jest " +unikalne+ " liczb unikalnych");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Wczytaj wymiar tablicy 2d: ");
        int MAX = 2;

        int[][] t = new int[MAX][MAX];

        losowanie(t,MAX);
        wypisywanie(t,MAX);
        przekatne(t,MAX);
        sumaBokow(t,MAX);
        minMaxWierszy(t,MAX);
        czyNieparzysta(t,MAX);
        czyParzyste(t, MAX);
        czyWierszRownyKolumnie(t, MAX);

        maxSumaSasiadow(t,MAX);
        czyUnikalne(t, MAX);
    }
}
