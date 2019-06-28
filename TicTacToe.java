public class TicTacToe {
    public static void main(String[] args) {
        WelcomeMenu menu = new WelcomeMenu();
        Score score = new Score();
        
        System.out.println(menu.getText());

        String userInput = ConsoleReader.readConsole();

        System.out.println("User input: " + userInput);
    }

    public void turnLoop() {
        // print board
        
        // ask for user input

        // check board and add move

        // check for win conditions

        // AI turn

        // check for win conditions

        // repeat
    }

    

}