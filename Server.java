import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(4444);

        System.out.println("Server avviato");

        Socket client = server.accept();

        System.out.println("Client connesso");


        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(client.getInputStream())
                );
        while (true) {
            String messaggio = reader.readLine();
            if ("quit".equals(messaggio)) {
                break;
            }
            if (!(messaggio==null)) {
                System.out.println("Message received: " + messaggio);
            }


        }


    }


}