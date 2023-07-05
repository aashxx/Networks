import java.io.*;
import java.net.*;

class chat_server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1999);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while(!br.readLine().equals("quit")) {
                System.out.println("She says: "+dis.readUTF());
                dos.writeUTF(br.readLine());
            }
            ss.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}