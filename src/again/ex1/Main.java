package again.ex1;

public class Main {
    public static void main( String[] args){
        Bank p1 = new Bank(1000,10);
        Bank p2 = new Bank(1500,10);

//        1000*10/1200 = 8,(3)
        p1.calculateInterest(3);
        p2.calculateInterestForOneYear();
    }
}
