import java.io.Console;
import java.security.NoSuchAlgorithmException;

public class App{
    public static void main(String [] args){
        Console myConsole = System.console();

        System.out.println("Enter your password please: ");
        String password = myConsole.readLine();
            System.out.println("*******YOUR HASHED PASSWORD********");
        try {
            System.out.println(HashPassword.hashPassword(password));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
            System.out.println("******* Thank You ! *******");

    }
}