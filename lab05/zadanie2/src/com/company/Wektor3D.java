package com.company;

public class Wektor3D {
    private double a,b,c;//deklaracja 3 wspolrzednych typu double

    public Wektor3D(double a,double b,double c){ //konstruktor inicjalizujący 3 podane zmienne
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static double iloczynSkalarny(Wektor3D w1, Wektor3D w2){//obliczanie iloczynu skalarnego na podstawie dwoch obiektow typu Wektor3D
        double scalar = 0; //deklaracja naszego iloczynu skalarnego
        scalar = scalar + (w1.a * w2.a);
        scalar = scalar + (w1.b * w2.b);
        scalar = scalar + (w1.c * w2.c);

        return scalar; //zwracam iloczyn skalarny
    }

    public static Wektor3D iloczynWektorowy(Wektor3D w1, Wektor3D w2){//obliczanie iloczynu wektorowego na podstawie dwoch obiektow typu Wektor3D
        double a = 0,b = 0,c = 0; //deklaracja 3 zmiennych lokalnych

        a = (w1.b * w2.c) - (w1.c * w2.b); //wyliczanie pierwszej wspolrzednej wektora
        b = (w1.c * w2.a) - (w1.a * w2.c); //wyliczanie drugiej wspolrzednej wektora
        c = (w1.a * w2.b) - (w1.b * w2.a); //wyliczanie trzeciej wspolrzednej wektora

        Wektor3D wektor = new Wektor3D(a,b,c); //tworzenie nowego obiektu wektor o wspolrzednych a,b,c
        return wektor;
    }

    @Override
    public String toString(){//funkcja to string wypisujaca wspolrzedne wektorow
        return String.format("x1 = %.2f, x2 = %.2f, x3 = %.2f", a, b, c); //%.2f oznacza wyspisywanie do 2 miejsc po przecinku 

    }
}
