package lap.l1;

public class Mainl1 {
    public static void main(String[] args) {
        Lap1 sp1 = new Lap1();
        Lap1 sp2 = new Lap1();
        Lap1 sp3 = new Lap1();
        sp1.code = 1;
        sp2.code = 2;
        sp3.code = 3;
        sp1.name="Laptop Dell";
        sp2.name="Lap Noob";
        sp3.name="Lap Nothings";
        sp1.money= 9000000 ;
        sp2.money= 8900000;
        sp3.money= 7900000;
        sp1.qty= 10 ;
        sp2.qty= 20;
        sp3.qty= 989;
        sp1.unit="Chiếc";
        sp2.unit="Chiếc";
        sp3.unit="Chiếc";

        sp1.changemoney(7800000);
        sp1.changeqty(56);
        if (sp1.checkhang()){
            System.out.println("Sản phẩm "+sp1.name+" còn "+sp1.qty+" sp");
        }else {
            System.out.println("Sản phẩm "+sp1.name+" hết hàng ");

        }
        sp1.run();
        sp2.run();
        sp3.run();
    }
}
