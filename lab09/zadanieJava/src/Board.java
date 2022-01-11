public class Board {//klasa tworzaca plansze na ktorej beda operowac pozniej watki
    int n;//wymiar tablicy 2d
    String[][] board;// tablica 2d (plansza)

    Board(int n){//kontruktor inicializujacy dane
        this.n = n;
        board = new String[n][n];

        for(int i = 0; i < n; i++){//petla ktora wypelnia plansze kropkami czyli pustymi polami
            for(int j = 0; j < n; j++){
                board[i][j] = ".";
            }
        }
    }

    public void print(){//funckja sluzaca do wypisywania planszy
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    //funkcja ktora sprawdza czy wylosowana komorka jest zajeta czy wolna
    public synchronized Boolean takePosition(Position oldPos, Position newPos){
        if(board[newPos.x][newPos.y] == "."){//sprawdzam czy pole jest wolne jezeli tak
            board[newPos.x][newPos.y] = "8";//ustawiam mrowke czyli 8
            releaseCell(oldPos);//zmieniam pierwotna komorke na pusta czyli na .
            return true;
        }else{
            return false;
        }
    }

    public synchronized void releaseCell(Position pos){
        board[pos.x][pos.y] = ".";
    }
}
