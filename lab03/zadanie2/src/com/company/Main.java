package com.company;
import java.util.Scanner;

public class Main {
    public static double pierwiastek(double a, int n, double dokl , int maxIloscIteracjii){
        double x0 = a, popPrzyb;

        do{
            popPrzyb = x0;
            x0 = (1/(double)n ) * ((n - 1) * popPrzyb + a/Math.pow(popPrzyb, n - 1));

        }while(maxIloscIteracjii > 0 && popPrzyb - x0 > dokl);

        return x0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Podaj liczbe pierwiastkowana");
        int A = s.nextInt();

        System.out.println("Podaj stopien pierwiastka");
        int n = s.nextInt();

        double dokl = 0.0000001;
        int iloscIter = 10;

        double wartPierwiastka = pierwiastek(A,n,dokl,iloscIter);

        System.out.println(wartPierwiastka);

    }
}
