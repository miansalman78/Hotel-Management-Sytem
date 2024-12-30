import java.util.*;
public class Room {
    private int Roomid;
    private String Roomtype;
    private Booking b;


    public Room() {
        Roomid = 0;
        Roomtype = "null";
        b = new Booking();
    }
    public Room(int Roomid,String Roomtype){
        this.Roomid=Roomid;
        this.Roomtype=Roomtype;
    }
    public void input(){
        Scanner in=new Scanner(System.in);


        System.out.println("****************Room DAta is ***********:");
        System.out.println("Enter a number of Room to check  is avlaible or Not avlable :");
        int ad = in.nextInt();
        if(ad>0&&ad<20){
            System.out.println("The room is Avalible :");
        }
        else if (ad==20){
            System.out.println("The Room is not Avalible:");
        }
        else {
            System.out.println("You put wrong No:");
        }
        System.out.println("Enter  Room id :");
        Roomid=in.nextInt();
        String y=in.nextLine();
        System.out.println("Enter Room Type :");
        Roomtype=in.nextLine();


        b.input();


    }

    public Room(int paymentId, double amount, int BookingId, String Type, int NO, int roomid, String roomtype) {
        Roomid = roomid;
        Roomtype = roomtype;
        b = new Booking(paymentId, amount, BookingId, Type, NO);
    }

    public int getRoomid() {
        return Roomid;
    }

    public void setRoomid(int roomid) {
        Roomid = roomid;
    }

    public String getRoomtype() {
        return Roomtype;
    }

    public void setRoomtype(String roomtype) {
        Roomtype = roomtype;
    }

    public void print() {
        System.out.println("****************Room DAta is ***********:");
        System.out.println("Roomid is:" + getRoomid());
        System.out.println("Room type is:" + getRoomtype());
        b.print();
    }
    public void Check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of Room if you want to Check :");
        int ad = sc.nextInt();
        if(ad>0&&ad<20){
            System.out.println("The room is Avalible :");
        }
        else if (ad==20){
            System.out.println("The Room is not Avalible:");
        }
        else {
            System.out.println("You put wrong No:");
        }
    }


    public static void Edit(ArrayList<String> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Room Number if went to Edt");
        int index = sc.nextInt();
        String x = sc.nextLine();
        System.out.println("Enter Room Number  if went to set");
        String se = sc.nextLine();
        al.set(index, se);
    }

    public void Del(ArrayList<String> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of Room if you want to remove");
        int ad = sc.nextInt();
        al.remove(ad);
    }

    public static void Add(ArrayList<String> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Room if you want to add");
        int index = sc.nextInt();
        String xyz = sc.nextLine();
        for (int i = 0; i < index; i++) {
            System.out.println("Enter Room Numbher of " + i);
            String ad = sc.nextLine();
            al.add(ad);
        }
    }
}
