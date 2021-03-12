package Session.s9;

import java.util.Scanner;

public class StaticDemo {
    public void run(){
        System.out.println("Run.......");
    }
    public static boolean ktSNT(int n){
        if (n<2)return false;
        for ( int i=2;i<Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    Scanner sc = new Scanner(System.in);

}
