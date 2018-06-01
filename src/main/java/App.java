import java.io.Console;
import java.security.NoSuchAlgorithmException;

public class App{
    public static void main(String [] args){
        Console myConsole = System.console();

        String password = myConsole.readLine();
        try {
            System.out.println(HashPassword.hashPassword(password));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }
}