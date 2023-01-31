class Board {
    private Piece[][] pieces;
    public int[][] board;

    public Board() {
        pieces = new Piece[8][8];
    }

    public void addPieces() {
       for (int i = 0; i < pieces.length; i++) {
           for (int j = 0; j < pieces[i].length; j++) {
               if (j < 2 || j > 5) {
                   pieces[i][j] = piece;
               }
           }
       }
    }

    public Piece getPiece(int x, int y) {
        return pieces[x][y];
    }

    public void makeBoard() {
        board = new int[8][8];
        for (int i = 0; i < 8; i++) {
            int count = 1;
            for (int j = 0; j < 8; j++) {
                board[i][j] = count;
                count ++;
            }

        }
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
