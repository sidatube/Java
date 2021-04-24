package again.ex2;

public class Main {
    public static void main(String[] args){
        Flight f1 = new Flight();
        Flight f2 = new Flight(857, "Toronto");

        f1.display();
        f2.display();
    }
}
