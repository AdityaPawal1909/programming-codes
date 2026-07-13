import java.net.*;

public class URL_Demo {
    public static void main(String[] args) throws Exception {

        URL u = new URL("https://www.google.com/search?q=java");

        System.out.println("Protocol: " + u.getProtocol());
        System.out.println("Host: " + u.getHost());
        System.out.println("Port: " + u.getPort());
        System.out.println("Path: " + u.getPath());
        System.out.println("Query: " + u.getQuery());
    }
}