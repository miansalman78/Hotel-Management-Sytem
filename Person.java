import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person() {
        name="null";
        age=0;
    }

    public void input(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter  name :");
        name=in.nextLine();
        System.out.println("Enter Age is:");
        age=in.nextInt();

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void print(){
        System.out.println("Name is:"+getName());
        System.out.println("Age is:"+getAge());
    }
}
