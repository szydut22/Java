package com.company;

public class Czworoscian{
    private Wektor3D v1;//wektor nr1 typu Wektor3D
    private Wektor3D v2;//wektor nr2 typu Wektor3D
    private Wektor3D v3;//wektor nr3 typu Wektor3D

    public Czworoscian(Wektor3D v1, Wektor3D v2, Wektor3D v3) {//konstruktor inicjalizujacy te wektory
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    private double jakaObjetosc(){//funkcja liczaca objetosc czworoscianu na podstawie podanych wektorow i na podstawie wzoru V = |(v1*v2)*v3|/6
        double V = 0;//deklaracja objetosci czworoscianu

        V = Math.abs(Wektor3D.iloczynSkalarny(Wektor3D.iloczynWektorowy(v1, v2), v3))/6;//wyliczanie objetosci na podstawie funkcji z klasy Wektor3D, Math.abs ma za zadanie zwrocic wartosc bezwzgledna danej liczby w naszym wypadku z objetosci

        return V;//zwracam objetosc czworoscianu
    }

    public void wypiszCzworoscian(){//funkcja wypisujaca wspolrzedne wektorow v1,v2,v3 oraz wypisujaca objetosc czworoscianu wyliczona na podstawie tych 3 wektorow
        System.out.println();
        System.out.println("Wspolrzedne wektora 1: " + v1);
        System.out.println("Wspolrzedne wektora 2: " + v2);
        System.out.println("Wspolrzedne wektora 3: " + v3);
        System.out.println();
        System.out.println("Objetosc czworoscianu wynosi: " + jakaObjetosc());
    }
}
