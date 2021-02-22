package As.a1;

import java.util.Scanner;

public class Mainas1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap canh 1: ");
        float c1= sc.nextFloat();
        System.out.println("nhap c2: ");
        float c2= sc.nextFloat();
        System.out.println("nhap c3: ");
        float c3= sc.nextFloat();
        As1 h1 = new As1();


        h1.setA(c1);
        h1.setB(c2);
        h1.setC(c3);

        if (h1.checkLegit()){
            System.out.println("Chu vi: "+h1.tinhC());
            System.out.println("Dientich: " +h1.tinhS());
            ;
        }else{
            System.out.println("Đây không phải 3 cạnh của 1 tam giác");
        }


    }

}
