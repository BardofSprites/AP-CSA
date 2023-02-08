import java.util.Scanner;

class Game {
    private Board board = new Board();
    private int turn = 1;

    public Game() {}

    // Main function that does everything together
    public void play() {
        game();
    }

    // Function that loop through the game until a winner
    public void game() {
        board.makeBoard();
        board.draw();
        while (true) {
            if (turn % 2 == 1) {
                System.out.println("   \u001B[41mWhite's move:\u001B[0m ");
            } else {
                System.out.println("   \u001B[41mBlack's move:\u001B[0m ");
            }
            getInput();
            board.draw();
        }
    }

    public void getInput() {
        Scanner input = new Scanner(System.in);
        // get the coordinate of the piece that needs to move
        System.out.println("Enter the piece that you want to move: ");
        String userInput = input.nextLine();
        String row = "";
        int col = 0;
        for (int i = 0; i < userInput.length(); i++) {
            row = userInput.substring(0,1);
            col = Integer.parseInt(userInput.substring(1,2));
        }

        // Asking for the destination
        System.out.println("Enter the row and column that you want to move to: ");
        String userInput2 = input.nextLine();
        String row2 = "";
        int col2 = 0;
        for (int i = 0; i < userInput2.length(); i++) {
            row2 = userInput2.substring(0,1);
            col2 = Integer.parseInt(userInput2.substring(1,2));
        }

        // Check if the move is valid, otherwise ask for the input again
        if (board.validMove(row, col, row2, col2) == true) {
            board.movePiece(row, col, row2, col2);
            turn ++;
        } else {
            System.out.println("Invalid move");
        }
    }
}
