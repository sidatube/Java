package lap.l2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int xy= sc.nextInt();

        lap2 test = new lap2();
        test.setA(xy);

        System.out.println("SNTTT: "+test.timSNTTT());
    }
}
