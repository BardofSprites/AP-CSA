class Piece {
    private String name;
    private int x;
    private int y;
    private boolean isWhite;

    public Piece(int x, int y, boolean isWhite) {
        this.x = 0;
        this.y = 0;
        this.isWhite = isWhite;
    }

    public String toString() {
        return " ";
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void move(int x, int y) {
        x += 1;
    }
}
