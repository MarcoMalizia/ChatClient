import java.io.IOException;

/**
 * Created by Marco on 06/10/2014.
 */
public class Ricevitore implements Runnable {
    Connessione con;
    String username;

    public Ricevitore(Connessione con, String username){
       this.con=con;
       this.username=username;
    }
    @Override
    public void run() {
        while(true){
            try {
                String messaggio = con.receiveMessage();
                if(!messaggio.startsWith(username)){
                    System.out.println(messaggio);
                }
            } catch (IOException e) {}
        }

    }
}
