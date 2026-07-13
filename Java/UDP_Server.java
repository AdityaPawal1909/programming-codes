import java.net.*;

public class UDP_Server {
    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket(5000);
        byte[] buffer = new byte[1024];

        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);

        System.out.println("Server waiting...");
        ds.receive(dp); // receive packet

        String msg = new String(dp.getData(), 0, dp.getLength());
        System.out.println("Client says: " + msg);

        ds.close();
    }
}