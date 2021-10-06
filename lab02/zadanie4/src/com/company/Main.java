package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        int size = 10;
        int counter = 0;
        int counter2 = 0;
        int a = 0;
        int maxS = 0;
        int[] tabPom = new int[3];
        int[] t = new int[size];


        System.out.print("Losowe liczby wylosowane przez program: ");

        for(int i = 0; i < size; i++){
            t[i] = rand.nextInt( 10 - 0 + 1) + 0;

            System.out.print(t[i]+ ", ");
        }

        System.out.println();

        int min = t[0];

        for(int k = 0; k < size; k++){
            if(t[k] == min){
                counter++;
            }
        }
        System.out.println("Najmniejsza liczba została wylosowana: " +counter+ " raz/y");
        do {
            for (int j = 0; j < size; j++) {

                if (t[j] < min) {
                    min = t[j];
                }
                if(a > 0){
                    if(a > 1){
                        if(t[j] > tabPom[a] && t[j] != tabPom[a-1] && t[j] != tabPom[a-2]){
                            tabPom[a] = t[j];
                        }
                    }else {
                        if (t[j] > tabPom[a] && t[j] != tabPom[a - 1]) {
                            tabPom[a] = t[j];
                        }
                    }

                }else {
                    if (t[j] > tabPom[0]) {
                        tabPom[a] = t[j];
                    }
                }
            }
            a++;
        }while(a < 3);

        System.out.print("3 co do wielkosci wylosowane liczby: ");
        for(int k = 0; k < 3; k++){
            System.out.print(tabPom[k]+ ", ");
        }

        System.out.println();

        if(czyGeometryczny(t, size) == true){
            System.out.println("Ciag jest ciagiem geometrycznym");
        }else{
            System.out.println("Ciag nie jest ciagiem geometrycznym");
        }

//    czy ciag jest rosnacy/malejacy/staly nwm jak to okreslic trzeba czekac na bardziej szczegolowe dane

        for(int x = 0; x < size; x++){
            for(int y = x + 1; y < size; y++){
                if(t[x] == t[y]){
                    counter2++;
                }
            }
        }

        if(counter2 == 0){
            System.out.println("wszystkie elementy tablicy są różne");
        }else{
            System.out.println("Nie wszystkie elementy tablicy są różne");
        }

        for(int x = 0; x < size; x++){
            if(x + 1 < size) {
                if (t[x] + t[x + 1] > maxS) {
                    maxS = t[x] + t[x + 1];
                }
            }
        }

        System.out.print("najwieksza suma to: " +maxS);
    }

    static boolean czyGeometryczny(int[] tab, int size){
        double q = tab[1] / tab[0];
        for (int i = 2; i < size; i++)
            if (tab[i] / tab[i - 1] != q)
                return false;
        return true;
    }
}
