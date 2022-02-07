import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    static {
        System.out.print("\033[H\033[2J");
        System.out.println("WELCOME TO MY TICKET");
        System.out.println("PLEASE ENTER THE NUMBER YOU SEE BESIDE YOUR DESIRED OPTION");
        System.out.println("");
        System.out.print("BOOKING FOR THE DATE ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println("");

    }

    public static void main(String[] args) {
        Date date = new Date();
        Menu obj = new Menu();
        obj.Test_code();
    }
}
