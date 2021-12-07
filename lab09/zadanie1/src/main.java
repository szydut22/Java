public class main {
    public static void main(String[] args) {
        int N = 5; //deklaracja ilosci wyjatkow
        int threadNum = (args.length > 0) ? Integer.parseInt(args[0]) : 2;//decyzja ile wyatkow ma byc defaultowo 2
        for(int i = 0; i < threadNum; i++){// petla towrzaca nowe watki
            new Thread(new myThread(i, threadNum), "Dutka-" + i).start();//stworzenie nowego watku do myThread przekazuje dodatkowo aktualny nr watku oraz ilosc watkow
        }
    }
}
