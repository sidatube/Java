package As.a2;

import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so thu 1: ");
        int t = sc.nextInt();
        System.out.println("Nhap tu so thu 2: ");
        int t2 = sc.nextInt();
        int m;
        do {
            System.out.println("Nhap mau so thu 1: ");
            m = sc.nextInt();
            if(m==0){
                System.out.println("Mau so khong hop le");
            }
        }while (m==0);
        int m2;
        do {
            System.out.println("Nhap mau so thu 2: ");
            m2 = sc.nextInt();
            if(m2==0){
                System.out.println("Mau so khong hop le");
            }
        }while (m2==0);
        As2 bt = new As2();
        bt.setTuso(t);
        bt.setMauso(m);
        bt.setTuso2(t2);
        bt.setMauso2(m2);
        bt.inPS();
        System.out.println("Phan so rut gon la:");
        bt.rutGon(t,m);
        bt.nghichDao(t,m);
        System.out.println("Tong 2 phan so la:");
        bt.add();
        System.out.println("hieu 2 phan so  la:");
        bt.sub();
        System.out.println("tich la:");
        bt.mul();
        System.out.println("thuong la:");
        bt.div();
    }

}
