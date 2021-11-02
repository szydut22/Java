package com.company;

public class Main {
    public static void main(String[] args) {
	    Wektor3D wektor1 = new Wektor3D(2.2,5.3,9.5); //tworze obiekt pierwszego wektora
        Wektor3D wektor2 = new Wektor3D(2.9,3.4,7.4); //tworze obiekt drugiego wektora
        Wektor3D wektor3 = new Wektor3D(1.3,5.9,6.6); //tworze obiekt trzeciego wektora

        Czworoscian czw = new Czworoscian(wektor1,wektor2,wektor3); //tworze obiekt czw klasy czwroscian, przekazuje mu 3 obiekty klasy Wektor3D

        System.out.println(wektor1.toString());//wypisuje dane 1 wektora
        System.out.println(wektor2.toString());//wypisuje dane 2 wektora
        System.out.println(wektor3.toString());//wypisuje dane 3 wektora

        czw.wypiszCzworoscian(); // wywoluje funkcje wypiszCzworoscian klasy Czworoscian ktora ma za zadanie wypisac wpspolrzedne wektorow uzytych do obliczania objetosci oraz wypisac rowniez objetosc

    }
}
