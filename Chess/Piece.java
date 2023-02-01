class Piece {
    private String name;
    private int x;
    private int y;
    private boolean isWhite;

    public Piece(int x, int y, boolean isWhite) {
        this.x = 0;
        this.y = 0;
    }

    public String toString() {
        return "";
    }

    public void setColor(boolean isWhite) {
        if (isWhite) {
            this.isWhite = true;
        } else {
            this.isWhite = false;
        }
    }

    public void move() {
        // Moves the piece forward once.
        // This will be overriden by other classes
        x += 1;
    }
}
