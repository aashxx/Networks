import java.io.*;
import java.net.*;

class chat_client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 1999);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while(!br.readLine().equals("quit")) {
                dos.writeUTF(br.readLine());
                System.out.println("He says: "+dis.readUTF());
                dos.flush();
            }
            s.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}