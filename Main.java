import java.util.*;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Hotel a = new Hotel("Marina", "Gujranwala", 3000.0, "Ali", 54, 545, 43333, "Wazirabad", 54555, 21, 6000.0, 98, "Luxry", 43, 54, "Business");
        a.print();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("");
        String username, password;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter username:");
        username = in.nextLine();
        System.out.println("Enter password:");
        password = in.nextLine();

            System.out.println("*****************Welcome to Hotel Management System**************** \n");
            System.out.println("Press 1 for Check Total Room in Hotel :");
            System.out.println("Press 2 for check room is Avalible or No");
            System.out.println("Press 3 for New Customer Data: ");
            System.out.println("Press 4 for NEw Manger Data :");
            System.out.println("Press 5 for for new Room Data :");
            System.out.println("Press 6 Hotel DAta:");
            System.out.println("Press 7 for if You Want To Add Manger :");
            System.out.println("Press 8 for if You Want To Add  Customer:");
            System.out.println("Press 9 for if You Want To Add  Room  :");
            System.out.println("Press 10 for if You Want To  Add Payment :");

            System.out.println("Press 0 for Exit :");
            int choice = in.nextInt();


            do {

                switch (choice) {
                    case 1:
                        System.out.println("Total Room is 20 ");
                        System.out.println("");
                        break;
                    case 2:

                        Room ab = new Room();
                        ab.Check();
                        System.out.println(ab);

                        System.out.println("");
                        break;

                    case 3:
                        Customer c = new Customer();
                        c.input();
                        c.print();
                        System.out.println("");
                        break;
                    case 4:
                        Manger m = new Manger();
                        m.input();
                        m.print();
                        System.out.println("");
                        break;
                    case 5:
                        Room r = new Room();
                        r.input();
                        r.print();
                        System.out.println("");
                        break;

                    case 6:
                        Hotel hi = new Hotel();
                        hi.input();
                        hi.print();
                        System.out.println("");
                    case 7:
                        ArrayList<String> li = new ArrayList<String>();
                        Manger m1 = new Manger();
                        m1.Add(li);
                        System.out.println(li);
                        m1.Edit(li);
                        System.out.println(li);
                        m1.Del(li);
                        System.out.println(li);
                        System.out.println("");
                        break;
                    case 8:
                        ArrayList<String> ol = new ArrayList<String>();
                        Customer c1 = new Customer();
                        c1.Add(ol);
                        System.out.println(ol);
                        c1.Edit(ol);
                        System.out.println(ol);
                        c1.Del(ol);
                        System.out.println(ol);
                        System.out.println("");
                        break;
                    case 9:
                        ArrayList<String> rr = new ArrayList<String>();
                        Room r1 = new Room();
                        r1.Add(rr);
                        System.out.println(rr);
                        r1.Edit(rr);
                        System.out.println(rr);
                        r1.Del(rr);
                        System.out.println(rr);
                        System.out.println("");
                        break;
                    case 10:
                        ArrayList<String> A = new ArrayList<String>();
                        Payment p = new Payment();
                        p.Add(A);
                        System.out.println(A);
                        p.Edit(A);
                        System.out.println(A);
                        p.Del(A);
                        System.out.println(A);
                        System.out.println("");
                        break;

                    default:

                        System.out.println("Invalid choice!");
                }
                System.out.println("Press 1 for Check Total Room in Hotel :");
                System.out.println("Press 2 for check room is Avalible or No");
                System.out.println("Press 3 for New Customer Data: ");
                System.out.println("Press 4 for NEw Manger data :");
                System.out.println("Press 5 for for new Room Data :");
                System.out.println("Press 6 Hotel DAta:");
                System.out.println("Press 7 for if You Want To Add Manger :");
                System.out.println("Press 8 for if You Want To Add  Customer:");
                System.out.println("Press 9 for if You Want To Add  Room  :");
                System.out.println("Press 10 for if You Want To  Add Payment :");

                System.out.println("Press 0 for Exit :");
                choice = in.nextInt();
            } while (choice != 0);

        }
}


