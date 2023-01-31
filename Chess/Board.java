class Board {
    private Piece[][] pieces;
    public String[][] board;

    public Board() {
        pieces = new Piece[8][8];
    }

    public void addPice(Piece piece, int x, int y) {
        pieces[x][y] = piece;
    }

    public Piece getPiece(int x, int y) {
        return pieces[x][y];
    }

    public void makeBoard() {
        board = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
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
