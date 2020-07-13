import java.io.IOException;


/**
 * Created by Marco on 06/10/2014.
 */
public class ClientMain {
    public static void main(String[] args) throws IOException {

        ScannerMessaggi scm = new ScannerMessaggi();
        String username = scm.richiestaUsername();
        String ip = scm.richiestaIp();
        int port = scm.richiestaPorta();
        Connessione con = Connessione.connetti(ip,port,username);
        new Thread(new Postino(con,scm)).start();
        new Thread(new Ricevitore(con,username)).start();

    }
}
