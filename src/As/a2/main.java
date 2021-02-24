package As.a2;

import java.util.Scanner;

public class main {
    public static void main(String[] args){


        As2 bt = new As2();
        bt.setTuso(5);
        bt.setMauso(6);
        As2 bt2 = new As2();
        bt2.setTuso(5);
        bt2.setMauso(10);
        As2 t =bt.add(bt2);
        t.inPS();
    }

}
