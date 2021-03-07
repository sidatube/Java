package As.a7;

import java.util.*;

public class Quanlysv implements Menu{
    ArrayList<Sinhvien> Svlist;

    public Quanlysv() {
        Svlist = new ArrayList<Sinhvien>();
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id");
        System.out.println("4. Sort student by gpa");
        System.out.println("5. Sort student by name");
        System.out.println("6. Show studen");
        System.out.println("0. Exit.");
        int m = sc.nextInt();
        if (m>=0&&m<=6){
            if (m==1){
                System.out.println("Nhap ID:");
                int ID =sc.nextInt();
                System.out.println("Nhap ten:");
                String Name=sc.next();
                sc.nextLine();
                System.out.println("Nhap tuoi:");
                int Age=sc.nextInt();
                System.out.println("Nhap dia chi:");
                String Address=sc.next();
                sc.nextLine();
                System.out.println("Nhap diem tb:");
                double Gpa=sc.nextDouble();
                Addstudent(ID,Name,Age,Address,Gpa);
                menu();
            }else if (m==2){
                System.out.println("Nhap ID:");
                int ID =sc.nextInt();
                Editstudentbyid(ID);
                menu();
            }else if (m==3){
                System.out.println("Nhap ID:");
                int ID =sc.nextInt();
                Deletebyid(ID);
                menu();
            }else if (m==4){
                sortbygpa();
                menu();
            }else if (m==5){
                sortbyname();
                menu();
            }else if (m==6){
                Showstudent();
                menu();
            }else if (m==0){
                Exit();
            }
        }else {
            System.out.println("Nhap tu 0 den 6");
            menu();
        }
    }


    @Override
    public void Addstudent(int ID, String name, int age, String address, double gpa) {
        for (Sinhvien s: Svlist
             ) {
            if (s.getID()==ID){
                System.out.println("Da co sinh vien co ID la "+ID);
                menu();
                return;
            }
        }
        Sinhvien p = new Sinhvien(ID,name,age,address,gpa);
        Svlist.add(p);
        System.out.println("Da add");

    }

    @Override
    public void Editstudentbyid(int ID) {
        Scanner sc = new Scanner(System.in);
        for (Sinhvien s: Svlist
             ) {
            if (s.getID()==ID){
                System.out.println("Nhap ten:");
                s.setName(sc.nextLine());
                System.out.println("Nhap tuoi:");
                s.setAge(sc.nextInt());
                System.out.println("Nhap dia chi:");
                s.setAddress(sc.nextLine());
                System.out.println("Nhap diem tb:");
                s.setGpa(sc.nextDouble());
                System.out.println("Da fix");
                return;
            }
        }
        System.out.println("Khong co sinh vien co id "+ID);

    }

    @Override
    public void Deletebyid(int ID) {
        Scanner sc = new Scanner(System.in);
        for (Sinhvien s: Svlist
        ) {
            if (s.getID()==ID){
               Svlist.remove(s);
               System.out.println("Da xoa");
                return;
            }
        }
        System.out.println("Khong co sinh vien co id "+ID);
    }

    @Override
    public void sortbygpa() {
        Collections.sort(Svlist, new Comparator<Sinhvien>() {
            @Override
            public int compare(Sinhvien o1, Sinhvien o2) {
                return (int)o2.getGpa()-(int)o1.getGpa();
            }
        });
        System.out.println("Da xep theo Gpa");

    }

    @Override
    public void sortbyname() {
        Collections.sort(Svlist, new Comparator<Sinhvien>() {
            @Override
            public int compare(Sinhvien o1, Sinhvien o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Da xep theo ten");

    }

    @Override
    public void Showstudent() {
        System.out.println("Danh sach sinh vien:");
        for (Sinhvien p: Svlist
             ) {
            System.out.println("ID: "+p.getID());
            System.out.println("Ho va ten: "+p.getName());
            System.out.println("Tuoi: "+p.getAge());
            System.out.println("Dia chi: "+p.getAddress());
            System.out.println("Diem trung binh: "+p.getGpa());
        }
    }

    @Override
    public void Exit() {
        System.out.println("End");
return;
    }
}
