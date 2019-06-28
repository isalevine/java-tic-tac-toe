public class TicTacToe {
    public static void main(String[] args) {
        WelcomeMenu menu = new WelcomeMenu();
        Board board = new Board();
        
        System.out.println(menu.getText());

        turnLoop(board);

        String userInput = ConsoleReader.readConsole();
        System.out.println("User input: " + userInput);
    }

    public static void turnLoop(Board board) {
        // print board
        board.printBoard();

        // ask for user input

        // check board and add move

        // check for win conditions

        // AI turn

        // check for win conditions

        // repeat
    }

    

}