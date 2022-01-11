public class Mrowka implements Runnable {//klasa mrowki
    Board board;
    Position pos;
    int n;

    Mrowka(Board plansza) {//kontruktor inicializujacy
        this.board = plansza;
        this.n = board.n;
    }

    public void moveToStartingRandomPosition(){//ustawianie mrowek na planszy podczas pierwszego ruchu
        pos = new Position(n);
        Position newPos = new Position(n);
        Boolean res = board.takePosition(pos, newPos);
        if(res == true){
            pos = newPos;
        }
    }

    public void moveToNextPosition(){//ustawianie mrowek na planszy w kolejnych etapach
        pos = new Position(n);
        Position newPos = new Position(pos);
        Boolean res = board.takePosition(pos, newPos);
        if(res == true){
            pos = newPos;
        }
    }

    @Override
    public void run() {
        try {
            moveToStartingRandomPosition();//rozmieszczam watki na planszy po raz pierwszy po czym je usypiam
            while(true){
                Thread.sleep(1000);
                moveToNextPosition();//ustawianie mrowki w kolejnych ruchach
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e){//wyjatek gdy wyjdziemy poza nasza plansze
            board.releaseCell(pos);// zmieniam aktualna komorke na pusta
            Thread.currentThread().interrupt();//koncze prace watku
        }
    }
}
