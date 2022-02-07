import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

    public void Test_code() {
        Scanner sc = new Scanner(System.in);
        int choice;
        int opt = 0;
        int count = 0;
        boolean doneM = false;
        Vector<Ticket> itv = new Vector<Ticket>();
        Vector<Ticket> dtv = new Vector<Ticket>();

        do {
            System.out.println("1)BOOK INTERNATIONAL FLIGHT\n2)BOOK DOMESTIC TICKET");
            System.out.println("3)DOMESTIC AVAILABILITY\n4)INTERNATIONAL AVAILABILITY");
            System.out.println("5)BOOKED TICKETS\n6)CANCEL AND DELETE");
            System.out.println("7)EXIT");

            System.out.println("ENTER YOUR OPTION");
            opt = sc.nextInt();

            System.out.print("\033[H\033[2J");

            switch (opt) {
                case 1: {
                    System.out.println("ENTER HOW MANY TICKETS YOU WANT TO BOOK");
                    count = sc.nextInt();
                    if (count < 6) {
                        for (int i = 0; i < count; i++) {
                            System.out.println("INTERNATIONAL TICKET BOOKING");
                            System.out.println("INTERNATIONAL BOOKING CODE :" + (i + 1));
                            Ticket objI = new International();
                            itv.addElement(objI);
                        }
                        System.out.print("\033[H\033[2J");
                        System.out.println("YOUR TICKET HAS BEEN BOOKED SUCESSFULLY");
                        System.out.println("TO CHECK CLICK ON OPTION 5");
                    } else {
                        System.out.println("YOU CANNOT BOOK MORE THAN 5 TICKETS AT ONCE");
                    }

                    break;
                }
                case 2: {
                    System.out.println("ENTER HOW MANY TICKETS YOU WANT TO BOOK");
                    count = sc.nextInt();
                    if (count < 6) {
                        for (int j = 0; j < count; j++) {
                            System.out.println("DOMESTIC TICKET BOOKING");
                            System.out.println("DOMESTIC BOOKING CODE :" + (j + 1));
                            Ticket objD = new Domestic();
                            dtv.addElement(objD);
                        }
                        System.out.print("\033[H\033[2J");
                        System.out.println("YOUR TICKET HAS BEEN BOOKED SUCESSFULLY");
                        System.out.println("TO CHECK CLICK ON OPTION 5");

                    } else {
                        System.out.println("YOU CANNOT BOOK MORE THAN 5 TICKETS AT ONCE");
                    }

                    break;
                }
                case 3: {
                    DA objDA = new DA();
                    break;
                }
                case 4: {
                    IA objDA = new IA();
                    break;
                }
                case 5: {
                    System.out.println("1)INTERNATIONAL TICKETS\n2)DOMESTIC TICKETS");
                    int key = sc.nextInt();
                    switch (key) {
                        case 1:
                            System.out.println("INTERNATIONAL BOOKED TICKETS");
                            for (int i = 0; i < itv.size(); i++) {
                                System.out.println(itv.get(i).display());
                                System.out.println("INTERNATIONAL BOOKING CODE :" + (i + 1));
                                System.out.println("----------------------------------------------------");
                            }
                            break;
                        case 2:
                            System.out.println("DOMESTIC BOOKED TICKETS");
                            for (int i = 0; i < dtv.size(); i++) {
                                System.out.println(dtv.get(i).display());
                                System.out.println("DOMESTIC BOOKING CODE :" + (i + 1));
                                System.out.println("----------------------------------------------------");
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                }
                case 6: {
                    System.out.println("1)INTERNATIONAL TICKETS\n2)DOMESTIC TICKETS");
                    int key = sc.nextInt();
                    switch (key) {
                        case 1: {
                            System.out.println("ENTER YOUR INTERNATIONAL BOOKING CODE?");
                            int x = sc.nextInt();
                            itv.remove(x - 1);
                            System.out.println("YOUR TICKET " + x + " IS CANCELLED");
                        }
                            break;
                        case 2: {
                            System.out.println("ENTER YOUR DOMESTIC BOOKING CODE?");
                            int x = sc.nextInt();
                            dtv.remove(x - 1);
                            System.out.println("YOUR TICKET " + x + " IS CANCELLED");
                        }
                            break;
                        default:
                            break;
                    }
                    break;
                }

                default:
                    break;
            }
            System.out.println("DO YOU WISH TO CONTINUE?\n1)YES\t2)NO");
            choice = sc.nextInt();
        } while (choice != 2);
        System.out.print("\033[H\033[2J");
        System.out.println("THANK YOU FOR VISITING US!!!!");
    }
}
