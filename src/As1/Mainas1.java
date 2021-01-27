package As1;

import lap1.Lap1;

public class Mainas1 {
    public static void main(String[] args) {
    As1 h1 = new As1();
    As1 h2 = new As1();
    h2.a=3;
    h2.b=4;
    h2.c=8;
    h1.a=3;
    h1.b=4;
    h1.c=5;
    if (h1.checklegit()){
        System.out.println("Đây là 3 cạnh của 1 tam giác");
        h1.inner();
    }else{
        System.out.println("Đây không phải 3 cạnh của 1 tam giác");
    }
        System.out.println("Về h2");
    if (h2.checklegit()){
        System.out.println("Đây là 3 cạnh của 1 tam giác");
        h2.inner();
    }else{
        System.out.println("Đây không phải 3 cạnh của 1 tam giác");
    }
    }

}
