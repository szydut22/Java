public class main {
    public static void main(String[] args){
        int n = 4;//wymiar tablic 2d oraz ilosc watkow
        Thread[] threads = new Thread[n]; //tablica watkow

        Board plansza = new Board(n); //stworzenie obiekty plansza

        for(int i = 0; i < n; i++){//petla w ktorej tworzą się watki
            threads[i] = new Thread(new Mrowka(plansza));//tworzenie watku i wpisywanie go do tablicy watkow
            threads[i].start();//wystartowanie watku
        }
        while(true){//petla w ktorej tworzone sa nowe watki z watkow ktore wyszly poza tablice
            try{
                for(int i = 0; i < n; i++){
                    if (threads[i].isAlive() != true){//sprawdzam stan watku jezeli nie jest RUNNING to wtedy tworze nowy watek
                        threads[i] = new Thread(new Mrowka(plansza));
                        threads[i].start();
                    }
                }
                plansza.print();//wypisywanie tablicy
                System.out.println();
                Thread.sleep(1000);//usypianie watku
            }catch(InterruptedException e){};
        }


    }
}
