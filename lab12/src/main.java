import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.File;
import java.util.concurrent.*;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Future<String> f;
        List<String> stringsFromFile = new ArrayList<>();
        File file = new File("/Users/szymondutka/Desktop/studiaRok2/javaLaby/lab12/src/input.dat");
        String line = null;

        try {
            Scanner s = new Scanner(file);
            while (s.hasNextLine()) {
                line = s.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        stringsFromFile = List.of(line.split(" "));

        ExecutorService executorService = Executors.newFixedThreadPool(stringsFromFile.size());

        for (String str : stringsFromFile) {
            Callable<String> c = () ->{
                return ("The length of string '" + str + "': " + str.length()+ "," + Thread.currentThread().getName());
            };

            f = executorService.submit(c);

            try {
                String result = f.get();
                System.out.println(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }
}
