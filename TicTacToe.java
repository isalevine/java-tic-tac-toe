public class TicTacToe {
    public static void main(String[] args) {
        WelcomeMenu menu = new WelcomeMenu();
        Score score = new Score();
        
        System.out.println(menu.getText());

        String userInput = ConsoleReader.readConsole();

        System.out.println("User input: " + userInput);
    }

    

}