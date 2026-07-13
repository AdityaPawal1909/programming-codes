import java.net.*;

public class IP_Methods {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("IP Address: " + ip.getHostAddress());
            System.out.println("Host Name: " + ip.getHostName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
