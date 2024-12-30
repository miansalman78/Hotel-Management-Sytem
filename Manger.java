import java.util.*;
public class Manger extends Person {
    private  int MangerId;

    public Manger() {
        super();
        MangerId=0;
    }
    public Manger(int MangerId){
        this.MangerId=MangerId;
    }
    public void input(){
        Scanner in=new Scanner(System.in);
        System.out.println("*********Manger data is ************");

        super.input();
        System.out.println("Enter  Manger Id is:");
        MangerId=in.nextInt();



    }

    public Manger(String name, int age,int mangerId) {
        super(name,age);
        MangerId = mangerId;
    }

    public int getMangerId() {
        return MangerId;
    }

    public void setMangerId(int mangerId) {
        MangerId = mangerId;
    }
    public void print(){
        System.out.println("****************Manger DAta is ***********:");
        super.print();
        System.out.println("MangerId is:"+getMangerId());

    }
    public static void Edit(ArrayList<String> al){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a index Number if you want to Edt Manger");
        int index = sc.nextInt();
        String x = sc.nextLine();
        System.out.println("Enter index Number  if want to set Manger");
        String se = sc.nextLine();
        al.set(index,se);
    }
    public void Del(ArrayList<String> al){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of index if you want to remove Manger");
        int ad = sc.nextInt();
        al.remove(ad);
    }
    public static void Add(ArrayList<String> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of index number  if you want to add Manger");
        int index = sc.nextInt();
        String xyz = sc.nextLine();
        for (int i = 0; i < index; i++) {
            System.out.println("Enter index Number of " + i);
            String ad = sc.nextLine();
            al.add(ad);
        }
    }
}
