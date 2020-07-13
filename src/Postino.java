import java.io.IOException;

/**
 * Created by Marco on 06/10/2014.
 */
public class Postino implements Runnable{

    Connessione con;
    ScannerMessaggi scm;

    public Postino (Connessione con, ScannerMessaggi scm){
        this.con = con;
        this.scm= scm;
    }

    @Override
    public void run() {
       while(true){
           try {
               con.sendMessage(scm.richiestaInputStr());
           } catch (IOException e) {}
       }
    }
}
