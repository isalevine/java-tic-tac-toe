import java.io.Console;

public class ConsoleReader {

    public static String readConsole() {
        Console console = System.console();
        String s = console.readLine();
        return s;
    }
    
}