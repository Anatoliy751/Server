import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    private static String HOST = "localhost";
    private static final int PORT = 7778;

    public static void main(String[] args) {
        try (Socket clientSocket = new Socket(HOST, PORT);

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())))


        {
          String respones = in.readLine();
            System.out.println(respones);
            out.flush();
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            out.println(name);
            respones = in.readLine();
            System.out.println(respones);

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
