package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x1,x2,x3;

        System.out.println("Podaj wspolrzedne 1 wektora: ");
        x1 = s.nextDouble();
        x2 = s.nextDouble();
        x3 = s.nextDouble();
        Wektor3D wektor1 = new Wektor3D(x1,x2,x3);//tworze obiekt pierwszego wektora

        System.out.println("Podaj wspolrzedne 2 wektora: ");
        x1 = s.nextDouble();
        x2 = s.nextDouble();
        x3 = s.nextDouble();
        Wektor3D wektor2 = new Wektor3D(x1,x2,x3);//tworze obiekt drugiego wektora

        System.out.println("Podaj wspolrzedne 3 wektora: ");
        x1 = s.nextDouble();
        x2 = s.nextDouble();
        x3 = s.nextDouble();
        Wektor3D wektor3 = new Wektor3D(x1,x2,x3);//tworze obiekt trzeciego wektora

        Czworoscian czw = new Czworoscian(wektor1,wektor2,wektor3); //tworze obiekt czw klasy czwroscian, przekazuje mu 3 obiekty klasy Wektor3D

        System.out.println(wektor1.toString());//wypisuje dane 1 wektora
        System.out.println(wektor2.toString());//wypisuje dane 2 wektora
        System.out.println(wektor3.toString());//wypisuje dane 3 wektora

        czw.wypiszCzworoscian(); // wywoluje funkcje wypiszCzworoscian klasy Czworoscian ktora ma za zadanie wypisac wpspolrzedne wektorow uzytych do obliczania objetosci oraz wypisac rowniez objetosc

    }
}
