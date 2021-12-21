public class Board {
    int n;
    String[][] board;

    Board(int n){
        this.n = n;
        board = new String[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = ".";
            }
        }
    }

//    public String getBoard(){
//        return board[][];
//    }

    public void print(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public synchronized Boolean takePosition(int oldX, int oldY, int newX, int newY){
        if(board[newX][newY] == "."){
            board[newX][newY] = toString();
            releaseCell(oldX, oldY);
            return true;
        }else{
            return false;
        }
    }

    public synchronized void releaseCell(int x, int y){
        board[x][y] = ".";
    }
}
