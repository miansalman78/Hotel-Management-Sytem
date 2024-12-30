import java.util.*;
public class Customer extends Person {
    private int Cnic;
    private String Adress;
    private int PhoneNo;

    public Customer() {
        super();
        Cnic = 0;
        Adress = "null";
        PhoneNo = 0;
    }
    public Customer(int cnic,String adress,int phoneNo){
        Cnic = cnic;
        Adress = adress;
        PhoneNo = phoneNo;
    }
    public void input(){

        Scanner in=new Scanner(System.in);
        System.out.println("****************Customer DAta is ***********:");
        super.input();

        System.out.println("Enter Cnic No :");
        Cnic=in.nextInt();
        String x =in.nextLine();
        System.out.println("Enter Adress is:");
        Adress=in.nextLine();
        System.out.println("Enter Phone No  is:");
        PhoneNo=in.nextInt();

    }

    public Customer(String name, int age, int cnic, String adress, int phoneNo) {
        super(name, age);
        Cnic = cnic;
        Adress = adress;
        PhoneNo = phoneNo;
    }

    public int getCnic() {
        return Cnic;
    }

    public void setCnic(int cnic) {
        Cnic = cnic;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }

    public void print() {
        System.out.println("****************Customer DAta is ***********:");
        super.print();
        System.out.println("Cnic is:" + getCnic());
        System.out.println("Adress  is:" + getAdress());
        System.out.println("Phone No is:" + getPhoneNo());
    }

    public static void Edit(ArrayList<String> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a index if want to Edt Customer");
        int index = sc.nextInt();
        String x = sc.nextLine();
        System.out.println("Enter Elenemt if want to set Customer");
        String se = sc.nextLine();
        al.set(index, se);
    }

    public void Del(ArrayList<String> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of index if you want to remove Customer");
        int ad = sc.nextInt();
        al.remove(ad);
    }

    public static void Add(ArrayList<String> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of index if you went to add Customer");
        int index = sc.nextInt();
        String xyz = sc.nextLine();
        for (int i = 0; i < index; i++) {
            System.out.println("Enter index number of " + i);
            String ad = sc.nextLine();
            al.add(ad);
        }
    }
}
