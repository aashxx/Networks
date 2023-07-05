import java.io.*;
import java.net.*;

class Ping {
    public static void sendPingRequest(String ipAddress) 
        throws UnknownHostException, IOException {
        InetAddress geek = InetAddress.getByName(ipAddress);
        System.out.println("\nSending Ping Request to "+ipAddress);
        if(geek.isReachable(5000)) {
            System.out.println("Host is reachable");
        }
        else {
            System.out.println("Host is not reachable");
        }
    }

    public static void main(String[] args) 
        throws UnknownHostException, IOException {
        String ipAddress = "127.0.0.1";
        sendPingRequest(ipAddress);

        ipAddress = "172.20.105.58";
        sendPingRequest(ipAddress);

        ipAddress = "145.154.42.58";
        sendPingRequest(ipAddress);

        ipAddress = "85.76.66.67";
        sendPingRequest(ipAddress);
    }
}

