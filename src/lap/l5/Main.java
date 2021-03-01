package lap.l5;

public class Main {
    public  static  void  main(String[] args){
        Person p1=new Person();
        p1.setName("LVT");
        p1.setDiaChi("HN");
        p1.setSex("Nam");
        p1.setDate("2000/12/20");
        p1.print();
        Student s1 = new Student();
        s1.setName("BCT");
        s1.setDiaChi("HN");
        s1.setSex("Nam");
        s1.setDate("2000/12/24");
        s1.setCode(002);
        s1.setDiem(9.9);
        s1.setMail("buichithanh24122000@gmail.com");
        s1.print();
    }
}
