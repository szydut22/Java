package com.company;

public class Main {
    public static void main(String[] args) {
	    Wektor3D wektor1 = new Wektor3D(2.2,5.3,9.5);
        Wektor3D wektor2 = new Wektor3D(2.9,3.4,7.4);
        Wektor3D wektor3 = new Wektor3D(1.3,5.9,6.6);

        double iloczynS;
        Wektor3D iloczynW;

        iloczynS = Wektor3D.iloczynSkalarny(wektor1, wektor2);
        iloczynS = Wektor3D.iloczynSkalarny(wektor2, wektor3);

        iloczynW = Wektor3D.iloczynWektorowy(wektor1, wektor2);
        iloczynW = Wektor3D.iloczynWektorowy(wektor2, wektor3);


    }
}
