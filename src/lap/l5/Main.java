package lap.l5;

public class Main {
    public  static  void  main(String[] args){
        Person p1=new Person();
        Person p2 = new Person("Tèo","Nam","1999/8/10","HCM");
        p1.input();
        p1.print();
        p2.print();
        Student s1 = new Student();
        s1.input();
        s1.print();

        Giaovien g1 = new Giaovien();
        g1.input();
        g1.print();

    }
}
