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
        String col = "";
        int row = 0;
        col = userInput.substring(0,1);
        row = Integer.parseInt(userInput.substring(1,2));
        System.out.println(row + " " + col);

        // Asking for the destination
        System.out.println("Enter the row and column that you want to move to: ");
        String userInputDestination = input.nextLine();
        String newCol = "";
        int newRow = 0;
        newCol = userInputDestination.substring(0,1);
        newRow = Integer.parseInt(userInputDestination.substring(1,2));
        System.out.println(newRow + " " + newCol);

        // Check if the move is valid, otherwise ask for the input again
        // if (board.validMove(col, row, newCol, newRow) == true) {
        //     board.movePiece(col, row, newCol, newRow);
        //     turn ++;
        // } else {
        //     board.movePiece(col, row, newCol, newRow);
        // }

        board.movePiece(col, row, newCol, newRow);
    }
}
