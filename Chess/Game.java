class Game {
    public Game() {}

    public void startGame() {
        Board board = new Board();
        // board.makeTest();
        // board.printTest();
        board.makeBoard();
        board.printBoard();
    }
}
