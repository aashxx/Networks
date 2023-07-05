import java.io.*;
import java.net.*;

public class RCEserver {
    public static void main(String[] args) throws IOException {
        try {
            String str;
            ServerSocket server = new ServerSocket(6555);
            Socket client = server.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            Runtime r = Runtime.getRuntime();
            r.exec(str);
            client.close();
            server.close();
        } catch(IOException e) {
            System.out.println("Error");
        }
    }
}
