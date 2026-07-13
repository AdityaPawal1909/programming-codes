import java.io.*;
import java.net.*;

public class serversocket {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server is waiting...");

        Socket s = ss.accept(); // accept connection
        System.out.println("Client connected");

        DataInputStream dis = new DataInputStream(s.getInputStream());
        String msg = dis.readUTF();

        System.out.println("Message from client: " + msg);

        ss.close();
    }
}