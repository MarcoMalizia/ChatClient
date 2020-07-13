import java.util.Scanner;

/**
 * Created by Marco on 06/10/2014.
 */
public class ScannerMessaggi {
    private Scanner sc;

    public ScannerMessaggi (){
        this.sc=new Scanner(System.in);
    }

    public String richiestaIp (){
        System.out.println("Inserisci l' ip.");
        return sc.nextLine();
    }

    public String richiestaUsername(){
        System.out.println("Inserisci il tuo username");
        return sc.nextLine();
    }

    public int richiestaPorta (){
        System.out.println("Inserici la porta");
        return Integer.parseInt(sc.nextLine());
    }

    public String richiestaInputStr(){
        return sc.nextLine();
    }
}
