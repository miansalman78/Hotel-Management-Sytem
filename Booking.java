import java.util.*;
public class Booking {
    private int BookingId;
    private String Type;
    private int NO;
    private Payment p;

    public Booking() {
        BookingId = 0;
        Type = "null";
        NO = 0;
        p = new Payment();
    }
    public Booking(int BookingId,String Type,int No){
        this.BookingId = BookingId;
        this.Type = Type;
        this.NO = NO;
    }
    public void input(){
        Scanner in=new Scanner(System.in);
        System.out.println("**********Booking data is ************");
        System.out.println("Enter Booking id is:");
        BookingId=in.nextInt();
        String y=in.nextLine();
        System.out.println("Enter Type:");
        Type=in.nextLine();
        System.out.println("Enter No of booking room :");
        NO=in.nextInt();
        p.input();

    }

    public Booking(int paymentId, double amount, int bookingId, String Type, int NO) {
        this.BookingId = BookingId;
        this.Type = Type;
        this.NO = NO;
        p = new Payment(paymentId, amount);
    }

    public int getBookingId() {
        return BookingId;
    }

    public void setBookingId(int bookingId) {
        BookingId = bookingId;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getNO() {
        return NO;
    }

    public void setNO(int NO) {
        this.NO = NO;
    }

    public void print() {
        System.out.println("**********booking data is ************");
        System.out.println("Booking id  is:" + getBookingId());
        System.out.println("Type is:" + getType());
        System.out.println("Number is:" + getNO());
        p.print();
    }

    public static void Edit(ArrayList<String> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a index if want to Edt Booking");
        int index = sc.nextInt();
        String x = sc.nextLine();
        System.out.println("Enter Elenemt if want to set Booking");
        String se = sc.nextLine();
        al.set(index, se);
    }

    public void Del(ArrayList<String> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of index if you want to remove Booking");
        int ad = sc.nextInt();
        al.remove(ad);
    }

    public static void Add(ArrayList<String> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of index you went to add Booking");
        int index = sc.nextInt();
        String xyz = sc.nextLine();
        for (int i = 0; i < index; i++) {
            System.out.println("Enter Element Booking of " + i);
            String ad = sc.nextLine();
            al.add(ad);
        }
    }
}
