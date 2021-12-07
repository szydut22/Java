import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class myThread implements Runnable {
    private int[] tab; //tablica pomocniczna
    private int actualNumber;
    private int numOfthreads;

    public myThread(int i, int threadNum) {//konstruktor inicjalizujacy aktualny watek oraz ilosc watkow potrzebna do stworzenia tablicy
        this.actualNumber = i;
        this.numOfthreads = threadNum;
    }

    public void run(){
        String n = Thread.currentThread().getName(); //nazwa watku wraz z jej numerem

        tab = new int[numOfthreads];

        for(int i = 0; i < 5; i++){
            int K = (ThreadLocalRandom.current().nextInt(1000)); //losowanie liczby na podstawie ktorej bedzie pozniej zasypial watek oraz bedzie liczona suma poszczegolnego watku
            tab[actualNumber] += K; //sumowanie liczb wylosowanych dla poszczegolnego watku
            System.out.println(n + ": " + tab[actualNumber]);

            try{
                Thread.sleep(K);//usypianie watku na wylosowany czas z linii 20
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(n +": ended with sum " + tab[actualNumber]);//wypisanie calkowitej sumy poszczegolnych watkow po tym jak kazdy z nich wykona sie 5 razy
    }
}