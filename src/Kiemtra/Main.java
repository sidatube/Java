package Kiemtra;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main( String[] args){

        Hotellis hs= new Hotellis();

        Scanner sc = new Scanner(System.in);
        System.out.println("Owner's name:");
        String m = sc.nextLine();
        hs.Timoc(m);

    }
}
