class Board {
    private Piece[][] board;
    private int[][] testBoard;
    public final String blackBackground = "\033[48:5:166m";
    public final String blackCharacter = "\u001B[30m";
    public final String whiteBackground = "\u001B[44m";
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
               if (row == 1) {
                   board[row][column] = new Pawn (row, column, true);
               } else if (row == 0) {
                   if (column == 0 || column == 7) {
                       board[row][column] = new Rook (row, column, true);
                   } else if (column == 1 || column == 6) {
                       board[row][column] = new Knight (row, column, true);
                   } else if (column == 2 || column == 5) {
                       board[row][column] = new Bishop (row, column, true);
                   } else if (column == 3) {
                       board[row][column] = new Queen (row, column, true);
                   } else if (column == 4) {
                       board[row][column] = new King (row, column, true);
                   } else {
                       board[row][column] = new Pawn (row, column, true);
                   }
               } else if (row == 6) {
                   board[row][column] = new Pawn (row, column, false);
               } else if (row == 7) {
                   if (column == 0 || column == 7) {
                       board[row][column] = new Rook (row, column, false);
                   } else if (column == 1 || column == 6) {
                       board[row][column] = new Knight (row, column, false);
                   } else if (column == 2 || column == 5) {
                       board[row][column] = new Bishop (row, column, false);
                   } else if (column == 3) {
                       board[row][column] = new King (row, column, false);
                   } else if (column == 4) {
                       board[row][column] = new Queen (row, column, false);
                   } else {
                       board[row][column] = new Pawn (row, column, false);
                   }
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
                        if (row % 2 == 0) {
                            if (column % 2 == 0) {
                                System.out.print(blackBackground + whiteCharacter + board[row][column].toString() + reset);
                            } else {
                                System.out.print(whiteBackground + whiteCharacter + board[row][column].toString() + reset);
                            }
                        } else {
                            if (column % 2 != 0) {
                                System.out.print(blackBackground + whiteCharacter + board[row][column].toString() + reset);
                            } else {
                                System.out.print(whiteBackground + whiteCharacter + board[row][column].toString() + reset);
                            }
                        }
                    } else {
                        if (row % 2 == 0) {
                            if (column % 2 == 0) {
                                System.out.print(blackBackground + blackCharacter + board[row][column].toString() + reset);
                            } else {
                                System.out.print(whiteBackground + blackCharacter + board[row][column].toString() + reset);
                            }
                        } else {
                            if (column % 2 != 0) {
                                System.out.print(blackBackground + blackCharacter + board[row][column].toString() + reset);
                            } else {
                                System.out.print(whiteBackground + blackCharacter + board[row][column].toString() + reset);
                            }
                        }
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
