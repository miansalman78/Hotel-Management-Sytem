import java.util.*;
public class Hotel {
    private String Hotelname;
    private String hoteladress;
    private double rent;

    private Manger m;
    private Customer c;
    private Room r;





    public Hotel() {
        Hotelname="null";
        hoteladress="null";
        rent=0.0;
        m=new Manger();
        c=new Customer();
        r=new Room();

    }


    public void input(){
        Scanner in=new Scanner(System.in);
        System.out.println("**********Hotel Data IS ***********:");
        System.out.println("Enter Hotel name :");
        Hotelname=in.nextLine();
        System.out.println("Enter hotel adress is:");
        hoteladress=in.nextLine();
        System.out.println("Enter Rent of Hotel is:");
        rent=in.nextDouble();
        m.input();
        c.input();
        r.input();

    }

    public Hotel(String hotelname, String hoteladress, double rent,String name,int age,int mangerId,int cnic,String adress,int phoneNo,int paymentId,double amount,int BookingId,String Type,int NO,int roomid,String roomtype) {
        this.Hotelname = hotelname;
        this.hoteladress = hoteladress;
        this.rent = rent;

        m=new Manger(name,age,mangerId);
        c=new Customer(name,age,cnic,adress,phoneNo);
        r=new Room(paymentId,amount,BookingId,Type,NO,roomid,roomtype);
    }

    public String getHotelname() {
        return Hotelname;
    }

    public void setHotelname(String hotelname) {
        Hotelname = hotelname;
    }

    public String getHoteladress() {
        return hoteladress;
    }

    public void setHoteladress(String hoteladress) {
        this.hoteladress = hoteladress;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
    public void print(){
        System.out.println("**********Hotel Data Is ***********:");
        System.out.println("Hotelname is:"+getHotelname());
        System.out.println("Hoteladsress is:"+getHoteladress());
        System.out.println("Hotel Rent is:"+getRent());
        m.print();
        c.print();
        r.print();


    }
}
