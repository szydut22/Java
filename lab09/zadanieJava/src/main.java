public class main {
    public static void main(String[] args){
        int n = 9;
        Thread[] threads = new Thread[n];

        Board plansza = new Board(n);


        for(int i = 0; i < n; i++){
            threads[i] = new Thread(new Mrowka(plansza, i));
            threads[i].start();
        }
        while(true){
            try{
                for(int i = 0; i < n; i++){
                    if (threads[i].isAlive() != true){
                        threads[i] = new Thread(new Mrowka(plansza, i));
                        threads[i].start();
                    }
                }
                plansza.print();
                System.out.println( );
                Thread.sleep(1000);
            }catch(InterruptedException e){};
        }


    }
}
