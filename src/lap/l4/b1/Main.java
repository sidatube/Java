package lap.l4.b1;

import lap.l4.b1.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Account a = new Account();
        a.setId(1);
        a.setName("NTC");
        a.setBalance(200000);
        Account b = new Account();
        b.setId(2);
        b.setName("Simp");
        b.setBalance(100000);


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien can nap:");
        if(a.credit(sc.nextInt())){
            System.out.println("Nap thanh cong");
            System.out.println("So du hien co: "+a.getBalance());
        }else {
            System.out.println("Nap khong thanh cong");
        }

        System.out.println("Nhap so tien can tra:");
        if (a.debit(sc.nextInt())){
            System.out.println("Thanh toan thanh cong");
            System.out.println("So du con lai: "+a.getBalance());
        }else {
            System.out.println("Thanh toan khong thanh cong");
        }

        if(a.tranFer(b)){
            System.out.println("Chuyen khoan thanh cong");
            System.out.println("So du con lai: "+a.getBalance());
        }else
            System.out.println("Chuyen khoan khong thanh cong");

    }
}
