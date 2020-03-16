package lesson6;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private final String serverIp;
    private final int serverPort;

    Client(String serverIp, int serverPort) {
        this.serverIp = serverIp;
        this.serverPort = serverPort;
    }

    public void run() {
        try (Socket socket = new Socket(serverIp, serverPort)) {
            new Handler(socket, "Server");

        } catch (UnknownHostException e) {
            System.err.println("Don't know about host ");
            System.exit(1);

        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to ");
            System.exit(1);
        }
    }
    public static void main(String[] args){
        new Client("localhost", 8290).run();
    }
}
