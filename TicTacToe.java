public class TicTacToe {
    public static void main(String[] args) {
        WelcomeMenu theMenu = new WelcomeMenu();

        System.out.println(theMenu.text);
    }

    public class WelcomeMenu {
        String text = "Welcome to Java Tic-Tac-Toe!";
    }

}