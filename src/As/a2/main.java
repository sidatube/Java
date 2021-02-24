package As.a2;

import java.util.Scanner;

public class main {
    public static void main(String[] args){


        phanso bt = new phanso();
        bt.setTuso(5);
        bt.setMauso(6);
        phanso bt2 = new phanso();
        bt2.setTuso(5);
        bt2.setMauso(10);
        phanso t =bt.add(bt2);
        t.inPS();
    }

}
