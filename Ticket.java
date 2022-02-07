import java.util.*;

public abstract class Ticket implements Idisplay {
    String name;
    String dot;
    int m = 0;
    int d = 0;
    int y = 0;
    String category;
    int cat;
    String gender;
    int g = 0;
    int age;
    int pnr = 0;
    boolean done = false;
    boolean doneA = false;
    Scanner sc = new Scanner(System.in);

    public Ticket(int c) {
        System.out.println("ENTER TRAVELLER'S NAME");
        this.name = sc.nextLine();
        while (!doneA) {
            try {
                System.out.println("ENTER YOUR AGE");
                this.age = sc.nextInt();
                doneA = true;
            } catch (InputMismatchException e) {
                String strA = sc.next();
                System.out.println("ENTER YOUR AGE IN NUMERICAL FORMAT");
            }
        }
        System.out.println("Enter the date");
        d = sc.nextInt();
        try {
            if (d > 31 || d < 1)
                throw new NumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("INVALID");
            System.out.println("ENTER CORRECT DATE");
            d = sc.nextInt();
        }
        System.out.println("Enter the month");
        m = sc.nextInt();
        try {
            if (m > 12 || m < 1)
                throw new NumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("INVALID");
            System.out.println("ENTER CORRECT MONTH");
            m = sc.nextInt();
        }
        System.out.println("Enter the year");
        y = sc.nextInt();
        try {
            if (y > 2200 || y < 2000)
                throw new NumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("INVALID");
            System.out.println("ENTER CORRECT YEAR");
            y = sc.nextInt();
        }

        while (!done) {
            try {
                System.out.println("ENTER YOUR GENDER");
                System.out.println("1)MALE 2)FEMALE");

                this.g = sc.nextInt();
                if (g == 1) {
                    this.gender = "MALE";
                } else {
                    if (g == 2) {
                        this.gender = "FEMALE";
                    } else {
                        System.out.println("TRY AGAIN WITH THE NUMBER YOU SEE BESIDE YOUR DESIRED OPTION");
                        System.out.println("ENTER YOUR GENDER");
                        System.out.println("1)MALE 2)FEMALE");
                    }
                }
                done = true;

            } catch (InputMismatchException e) {
                String str = sc.next();
                System.out.println("ENTER THE NUMBER YOU SEE BESIDE TO YOUR DESIRED OPT");

            }
        }

        if (age > 60) {
            this.category = "SENIOR CITIZEN";
        } else {
            if (age < 18) {
                this.category = "JUNIOR";
            } else {
                this.category = "GENERAL ADULT";
            }
        }
        Random ran = new Random();
        pnr = ran.nextInt(100000);

    }

    public abstract void nothing();

    public String display() {
        System.out.println("NAME:" + name);
        System.out.println("AGE:" + age);
        System.out.println("DATE OF TRAVEL:" + d + "/" + m + "/" + y);
        System.out.println("GENDER:" + gender);
        System.out.println("CATEGORY:" + category);
        System.out.println("PNR:" + pnr);
        return "----------------------------------------------------";
    }
}
