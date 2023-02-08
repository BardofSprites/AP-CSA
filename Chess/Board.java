class Board {
    private Piece[][] board;
    private int[][] testBoard;
    public final String blackBackground = "\u001B[44m";
    public final String blackCharacter = "\u001B[30m";
    public final String whiteBackground = "\u001B[43m";
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
        String letters = "ABCDEFGH";
        for (int row = 0; row<board.length; row++) {
            if (row == 0) {
                System.out.println("  A B C D E F G H ");
            }
            for (int column = 0; column<board[row].length; column++) {
                if (column == 0) {

                    System.out.print(8-row + " ");
                }
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

    public void movePiece(String row, int column, String newRow, int newColumn) {
        int r = 0;
        int r2 = 0;
        row = row.toUpperCase();
        newRow = newRow.toUpperCase();
        // Assigning the row to a number
        if (row == "A") {
            r = 0;
        } else if (row == "B")  {
            r = 1;
        } else if (row == "C")  {
            r = 2;
        } else if (row == "D")  {
            r = 3;
        } else if (row == "E")  {
            r = 4;
        } else if (row == "F")  {
            r = 5;
        } else if (row == "G")  {
            r = 6;
        } else if (row == "H")  {
            r = 7;
        }
        // Assigning the new row to a number
        if (newRow == "A") {
            r2 = 0;
        } else if (newRow == "B")  {
            r2 = 1;
        } else if (newRow == "C")  {
            r2 = 2;
        } else if (newRow == "D")  {
            r2 = 3;
        } else if (newRow == "E")  {
            r2 = 4;
        } else if (newRow == "F")  {
            r2 = 5;
        } else if (newRow == "G")  {
            r2 = 6;
        } else if (newRow == "H")  {
            r2 = 7;
        }
        board[r2][newColumn] = board[r][column];
        board[r][column] = null;
    }

    public boolean validMove(String row, int column, String newRow, int newColumn) {
        String letters = "abcdefgh";
        boolean valid = false;
        for (int i=0; i < letters.length(); i++) {
            if (row.toLowerCase() == letters.substring(i, i+1) && newRow.toLowerCase() == letters.substring(i, i+1)) {
                valid = true;
            }
        }
        return valid;
    }

    public Piece getPiece(int x, int y) {
        return board[x][y];
    }
}
