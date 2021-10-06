package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Podaj wielkosc bokow trojkata rownobocznego: ");
	    int n = s.nextInt();
	    int offset = (n-1);
	    int pom = 3;

	    for(int i = 1; i <= n; i++){
			for(int j = offset; j > 0; j--){
				System.out.print(" ");
			}

			if(i > 2 && i < n){
				System.out.print("*");

				for(int l = 0; l < pom; l++){
					System.out.print(" ");
				}
				pom += 2;
				System.out.print("*");

			}else{
				for(int k = 0; k < i; k++){
					System.out.print("*");
					System.out.print(" ");
				}
			}

			System.out.println("");
			offset--;
        }
    }
}
