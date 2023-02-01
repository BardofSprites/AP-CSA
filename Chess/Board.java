class Board {
    private Piece[][] board;
    private int[][] testBoard;

    public Board() {
        board = new Piece[8][8];
        // testBoard = new int[8][8];
    }

    // Sets up the pieces at the right positions, but not minding colors or type of piece
    // TODO Make this method do the things above
    public void makeBoard() {
       for (int i = 0; i < board.length; i++) {
           for (int j = 0; j < board[i].length; j++) {
               if (j < 2) {
                   board[i][j] = new Piece (i, j, true);
               } else if (j > 5) {
                   board[i][j] = new Piece (i, j, false);
               }
               else {
                   board[i][j] = null;
               }
           }
       }
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board [i][j] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(board[i][j].toString());
                }
                System.out.print(" \n");
            }
        System.out.print(" \n");
        }
    }

    public Piece getPiece(int x, int y) {
        return board[x][y];
    }

    // Fills a 2D array with numbers 1-8 on each row
    public void makeTest() {
        for (int i = 0; i < testBoard.length; i++) {
            for (int j = 0; j < testBoard[i].length; j++) {
                testBoard[i][j] = 0;
            }
        }
    }


    public void printTest() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(j+1);
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
