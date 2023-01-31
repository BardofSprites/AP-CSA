class Game {
    public Game() {}

    public void startGame() {
        Board board = new Board();

        board.addPieces();
        board.printBoard();
        board.makeBoard();
    }
}
