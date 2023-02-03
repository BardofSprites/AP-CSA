class Board {
    private Piece[][] board;
    private int[][] testBoard;
    public final String blackBackground = "\u001B[42m";
    public final String blackCharacter = "\u001B[32m";
    public final String whiteBackground = "\u001B[47m";
    public final String whiteCharacter = "\u001B[37m";
    public final String reset = "\u001B[0m";

    public Board() {
        board = new Piece[8][8];
        // testBoard = new int[8][8];
    }

    // Sets up the pieces at the right positions, but not minding colors or type of piece
    // TODO Make this method do the things above
    public void makeBoard() {
       for (int row = 0; row < board.length; row++) {
           for (int column = 0; column < board[row].length; column++) {
               if (row < 2) {
                   board[row][column] = new Piece (row, column, true);
               } else if (row > 5) {
                   board[row][column] = new Piece (row, column, false);
               }
               else {
                   board[row][column] = null;
               }
           }
       }
    }

    // Redraws the board after the move, by checking the board if there is a piece at the position, if not check the pattern of odd row and even row
    // basically a better printBoard method
    public void draw() {
        for (int row = 0; row<board.length; row++) {
            for (int column = 0; column<board[row].length; column++) {
                if (board [row][column] == null) {
                    if (row % 2 == 0) {
                        if (column % 2 == 0) {
                            System.out.print(blackBackground + "  " + reset);
                        } else {
                            System.out.print(whiteBackground + "  " + reset);
                        }
                    } else {
                        if (column % 2 != 0) {
                            System.out.print(blackBackground + "  " + reset);
                        } else {
                            System.out.print(whiteBackground + "  " + reset);
                        }
                    }
                } else {
                    if (board [row][column].isWhite() == true)  {
                        System.out.print(blackCharacter + board[row][column].toString() + reset);
                    } else {
                        System.out.print(whiteCharacter + board[row][column].toString() + reset);
                    }
                }
            }
            System.out.print(" \n");
        }
    }

    // DEPRECATED Prints the board
    public void printBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                if (board [row][column] == null) {
                    System.out.print("_");
                } else {
                    System.out.print(board[row][column].toString());
                }
            }
        System.out.print(" \n");
        }
    }

    public Piece getPiece(int x, int y) {
        return board[x][y];
    }
}
