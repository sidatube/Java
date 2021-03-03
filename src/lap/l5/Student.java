package lap.l5;

import java.util.Scanner;

public class Student extends Person{
    int code;
    double diem;
    String mail;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma so:");
        setCode(sc.nextInt());
        System.out.println("Diem thi:");
        setDiem(sc.nextDouble());
        System.out.println("Email:");
        setMail(sc.nextLine());

    }

    public void print() {
        super.print();
        System.out.println("Ma so: "+this.getCode());
        System.out.println("Diem thi: "+this.getDiem());
        System.out.println("Email: "+this.getMail());
    }
    public boolean hocBong(){
        return getDiem()>8;
    }
}
