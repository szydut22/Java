import java.util.Random;

public class Mrowka implements Runnable {
    Random rand = new Random();
    Board board;
    int x,y,n;
    int name;

    Mrowka(Board plansza, int i) {
        this.board = plansza;
        this.n = board.n;
        this.name = i;
    }

    public void moveToStartingRandomPosition(){
        int x2 = rand.nextInt(n);
        int y2 = rand.nextInt(n);
        Boolean res = board.takePosition(x, y, x2, y2);
        if(res == true){
            x = x2;
            y = y2;
        }
    }

    public void moveToNextPosition(){
        int x2 = x + rand.nextInt(1-(-1))+0;
        int y2 = y + rand.nextInt(1-(-1))+0;

        Boolean res = board.takePosition(x, y, x2, y2);
        if(res == true){
            x = x2;
            y = y2;
        }
    }

    @Override
    public void run() {
        try {
            moveToStartingRandomPosition();
            while(true){
                Thread.sleep(1000);
                moveToNextPosition();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("umieram");
            board.releaseCell(x,y);
            Thread.currentThread().interrupt();
        }
    }
}
