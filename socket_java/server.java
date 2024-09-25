// Server
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket  

 = new ServerSocket(8080);
        Socket clientSocket = serverSocket.accept();  

        // ... codice per gestire la comunicazione
    }
}