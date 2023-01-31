class Piece {
    private String name;
    private int x;
    private int y;
    private boolean isWhite;

    public Piece() {
        this.name = "Piece";
        this.x = 0;
        this.y = 0;
    }

    public String toString() {
        // Prints the piece
        return "";
    }

    public void move() {
        // Moves the piece forward once.
        // This will be overriden by other classes
        x += 1;
    }

}
