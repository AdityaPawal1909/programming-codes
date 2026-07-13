import java.io.*;
import java.net.*;

public class URLConnection_Class {
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.google.com");

        URLConnection con = url.openConnection();

        InputStream is = con.getInputStream();
        int data;

        while((data = is.read()) != -1) {
            System.out.print((char)data);
        }

        is.close();
    }
}