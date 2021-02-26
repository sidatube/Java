package lap.l3;

public class main {
    public static void main(String[] args){
        Room rm = new Room();
        rm.setTenroom("T2008m");;
        rm.setVitri("Phong A8");;
        rm.add("tretrau");
        rm.add("trenghe");
        rm.add("ga");
        rm.remove("tretrau");
        rm.Print();


    }
}
