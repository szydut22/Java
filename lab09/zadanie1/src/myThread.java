import java.util.concurrent.*;

public class myThread implements Callable<Integer>{
    private int[] tab; //tablica pomocniczna
    private int actualNumber;
    private int numOfthreads;
    private int sum;

    public myThread(int i, int numberOfThreads) {//konstruktor inicjalizujacy aktualny watek oraz ilosc watkow potrzebna do stworzenia tablicy
        this.actualNumber = i;
        this.numOfthreads = numberOfThreads;
    }

    @Override
    public Integer call(){
        tab = new int[numOfthreads];
        for(int i = 0; i < 5; i++){
            int K = (ThreadLocalRandom.current().nextInt(1000)); //losowanie liczby na podstawie ktorej bedzie pozniej zasypial watek oraz bedzie liczona suma poszczegolnego watku
            tab[actualNumber] += K; //sumowanie liczb wylosowanych dla poszczegolnego watku
            System.out.println("Dutka-"+ actualNumber + ": " + tab[actualNumber]);
            sum+=K;//zwiekszam sume o kolejna wylosowana liczbe watku

            try{
                Thread.sleep(K);//usypianie watku na wylosowany czas z linii 20
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Dutka-"+ actualNumber +": ended with sum " + tab[actualNumber]);//wypisanie calkowitej sumy poszczegolnych watkow po tym jak kazdy z nich wykona sie 5 razy
        return sum;//zwracam sume watku
    }


}