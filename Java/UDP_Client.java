import java.net.*;

public class UDP_Client {
    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket();

        String msg = "Hello Server!";
        byte[] data = msg.getBytes();

        InetAddress ip = InetAddress.getByName("localhost");

        DatagramPacket dp = new DatagramPacket(data, data.length, ip, 5000);

        ds.send(dp); // send packet

        ds.close();
    }
}