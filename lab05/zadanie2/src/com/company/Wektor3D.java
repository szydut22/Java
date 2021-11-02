package com.company;

public class Wektor3D {
    private double a,b,c;//deklaracja 3 wspolrzednych typu double

    Wektor3D(){}//pusty konstruktor potrzebny przy tworzeniu nowego obiektu w linii 24

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
        Wektor3D wektor = new Wektor3D();//tworzenie nowego obiektu wektor typu Wektor3D do ktorego bede wpisywal wspolrzedne powstalego wektora

        wektor.a = (w1.b * w2.c) - (w1.c * w2.b);
        wektor.b = (w1.c * w2.a) - (w1.a * w2.c);
        wektor.c = (w1.a * w2.b) - (w1.b * w2.a);

        return wektor;//zwracam obiekt
    }

    @Override
    public String toString(){//funkcja to string wypisujaca wspolrzedne wektorow
        return String.format("x1 = %f, x2 = %f, x3 = %f", a, b, c);

    }
}
