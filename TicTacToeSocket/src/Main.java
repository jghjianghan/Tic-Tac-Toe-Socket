
import controller.GameplayController;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
        final int SERVER_PORT_NUMBER = 6789;

        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Is Server? [Y/N]: ");
        boolean isServer = sc.nextLine().equals("Y");
        if (isServer) {
            ServerSocket welcomeSocket = new ServerSocket(SERVER_PORT_NUMBER);
            Socket connectionSocket = welcomeSocket.accept();
            System.out.println("Accepted");

            GameplayController controller = new GameplayController(true, connectionSocket);
            controller.start();
        } else {
            GameplayController controller = new GameplayController(false, new Socket("127.0.0.1", SERVER_PORT_NUMBER));
            controller.start();
        }
    }
}
