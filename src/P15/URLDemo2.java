package P15;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo2 {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("https://www.msbte.org.in");
        System.out.println("Protocol : " + hp.getProtocol());
        System.out.println("Port : " + hp.getPort());
        System.out.println("Host : " + hp.getHost());
        System.out.println("File : " + hp.getFile());
        System.out.println("Port : " + hp.toExternalForm());
    }
}
