package com.company;

public class Czworoscian{
    private static Wektor3D v1;
    private static Wektor3D v2;
    private static Wektor3D v3;

    public Czworoscian(Wektor3D v1, Wektor3D v2, Wektor3D v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    private double jakaObjetosc(){
        double V = 0;
        V = Wektor3D.iloczynSkalarny(Wektor3D.iloczynWektorowy(v1, v2), v3)/6;

        System.out.println("Objetosc wektora wynosi: " +V);
        return V;
    }

    public String toString(){
        return String.format("%s, %s, %s, %s\nV = %f", v1,v2,v3, Math.abs(jakaObjetosc()));
    }
}
