class Game {
    public Game() {}

    // Main function that does everything together
    public void play() {
        game();
    }

    // Function that loop through the game until a winner
    public void game() {
        Board board = new Board();
        board.makeBoard();
        board.draw();
    }
}
