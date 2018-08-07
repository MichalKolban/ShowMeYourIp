package MyIP;

import java.net.InetAddress;

public class MyIpAddress {

    public static void main(String[] args) throws Exception {

        InetAddress myIp = InetAddress.getLocalHost();


        System.out.println("Your ip number is : " + myIp.getHostAddress());
        



    }
}
