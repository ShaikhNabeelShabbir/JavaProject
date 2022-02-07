import java.util.Scanner;

public class International extends Ticket implements Idisplay {
    String sor;
    String des;

    Scanner sc = new Scanner(System.in);

    public void nothing() {
        // nothing
    }

    public International() {
        super();
        System.out.println("ENTER YOUR SOURCE");
        this.sor = sc.next();
        System.out.println("ENTER YOUR DESTINATION");
        this.des = sc.next();
    }

    public String display() {
        System.out.println("-------------------------------------------------");
        System.out.println("INTERNATIONAL TRAVELLER'S DETAIL");
        super.display();
        System.out.println("SOURCE:" + sor);
        System.out.println("DESTINATION:" + des);
        return "----------------------------------------------------";

    }
}
