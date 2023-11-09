package P14;

import java.net.InetAddress;
import java.util.Scanner;

public class InetDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Hostname");
        String H = sc.next();
        try {
            InetAddress ip = InetAddress.getByName(H);
            System.out.println("Host Name :"+ip.getHostName());
            System.out.println("IP Address :"+ip.getHostAddress());
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
