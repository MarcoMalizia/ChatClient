import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by Marco on 06/10/2014.
 */
public class Connessione {
    private Socket skt;
    private String ip;
    private String username;
    private int port;
    private DataOutputStream dos;
    private DataInputStream dis;

    private Connessione (String ip, int port, String username) throws IOException {
        this.skt=new Socket(ip,port);
        this.ip=ip;
        this.port=port;
        this.username=username;
        this.dis = new DataInputStream(skt.getInputStream());
        this.dos = new DataOutputStream(skt.getOutputStream());
    }


    public void sendMessage (String messaggio) throws IOException {
        this.dos.writeUTF(messaggio);
    }

    public  String receiveMessage () throws IOException {
        return this.dis.readUTF();
    }

    public static Connessione connetti (String ip,int port, String username) throws IOException {
        Connessione con = new Connessione(ip, port, username);
        con.sendMessage(username);
        System.out.println(con.receiveMessage());
        return con;
    }
}
