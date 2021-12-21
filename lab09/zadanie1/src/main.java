import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main {
    public static void main(String[] args){
        int numberOfThreads = Runtime.getRuntime().availableProcessors();//deklaracja liczby watkow ktore maja byc utworzone(na podstawie dostepnych aktualnie procesorow)

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        List<Future<Integer>> threads = new ArrayList<>();//tworzenie listy do ktorej beda wpisywane watki

        for (int i = 0; i < numberOfThreads; i++) {
            threads.add(executorService.submit(new myThread(i, numberOfThreads)));//wywoływanie watku i dopisywanie go do utworzonej wczesniej listy
        }
        executorService.shutdown();//zakonczenie watku
        int sum = 0;//zadeklarowanie sumy wszystkich watkow
        for (Future<Integer> future : threads) {//petla iterujaca po utworzonej liscie i tworzaca sume cealkowita wszystkich powstalych watkow
            try {
                sum += future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Testcase completed, the sum is:  " + sum);
    }
}
