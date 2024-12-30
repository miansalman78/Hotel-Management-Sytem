import java.util.*;
public class Payment {
    private int PaymentId;
    private double Amount;

    public Payment() {
        PaymentId = 0;
        Amount = 0.0;
    }
    public void input(){
        Scanner in=new Scanner(System.in);
        System.out.println("****************Payment DAta is ***********:");
        System.out.println("Enter  Payment id :");
        PaymentId=in.nextInt();
        System.out.println("Enter Amount:");
        Amount=in.nextDouble();

    }

    public Payment(int paymentId, double amount) {
        PaymentId = paymentId;
        Amount = amount;
    }

    public int getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(int paymentId) {
        PaymentId = paymentId;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public void print() {
        System.out.println("****************PAyment DAta is ***********:");
        System.out.println("Payment id is:" + getPaymentId());
        System.out.println("Amount is:" + getAmount());
    }

    public static void Edit(ArrayList<String> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a index if went to Edt payment");
        int index = sc.nextInt();
        String x = sc.nextLine();
        System.out.println("Enter Elenemt if went to set payment");
        String se = sc.nextLine();
        al.set(index, se);
    }

    public void Del(ArrayList<String> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of index if you want to remove payment");
        int ad = sc.nextInt();
        al.remove(ad);
    }

    public static void Add(ArrayList<String> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of index if you want to add payment");
        int index = sc.nextInt();
        String xyz = sc.nextLine();
        for (int i = 0; i < index; i++) {
            System.out.println("Enter Element of payment " + i);
            String ad = sc.nextLine();
            al.add(ad);
        }
    }
}
