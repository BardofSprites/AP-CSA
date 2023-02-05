class Game {
    public Game() {}

    public void startGame() {
        Board board = new Board();
        board.makeBoard();
        board.draw();
    }
}
