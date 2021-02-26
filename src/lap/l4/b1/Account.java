package lap.l4.b1;

import java.util.Scanner;

public class Account {
    int id;
    String name;
    double balance;

    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean credit(int a){
        if(a>0){
            setBalance(getBalance()+a);
            return true;
        }
        return false;
    }

    public boolean debit(int a){
        if(a<=getBalance()){
            setBalance(getBalance()-a);
            return true;
        }
        return false;

    }
    public boolean tranFer(Account B){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so tien can chuyen: ");
        int z= sc.nextInt();
        if (this.debit(z)){

            B.setBalance(getBalance()+z);
            return true;
        }else {
            return false;
        }
    }
}
