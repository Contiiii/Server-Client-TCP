
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Socket socket = new Socket("localhost", 4444);

        PrintWriter writer =
                new PrintWriter(socket.getOutputStream(), true);

        writer.println("Client connesso");
        while (true) {
            String s1 = input.nextLine();
            if (s1.equals("exit")) {
                break;
            }
            writer.println(s1);

        }


        socket.close();
    }
}