package com.company;

public class Wektor3D {
    private double a,b,c;

    Wektor3D(){}

    public Wektor3D(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static double iloczynSkalarny(Wektor3D w1, Wektor3D w2){
        double scalar = 0;
        scalar = scalar + (w1.a * w2.a);
        scalar = scalar + (w1.b * w2.b);
        scalar = scalar + (w1.c * w2.c);

        System.out.println("iloczyn skalarny wyonsi: " +scalar);
        return scalar;
    }

    public static Wektor3D iloczynWektorowy(Wektor3D w1, Wektor3D w2){
        Wektor3D wektor = new Wektor3D();

        wektor.a = (w1.b * w2.c) - (w1.c * w2.b);
        wektor.b = (w1.c * w2.a) - (w1.a * w2.c);
        wektor.c = (w1.a * w2.b) - (w1.b * w2.a);

        System.out.println("iloczyn wektorowy wyonsi: " +wektor);
        return wektor;
    }

    @Override
    public String toString(){
        return String.format("%f, %f, %f",a, b, c);
    }
}
