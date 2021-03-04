package lap.l6;

public class Main {
    public static void main(String[] args){
        Phonebook pb = new Phonebook();
        pb.insertPhone("Nam","0987654321");
        pb.insertPhone("Nam","0987654322");
        pb.insertPhone("Anh","0123456789");
        pb.printPhoneList();
        pb.sort();
        pb.printPhoneList();
    }
}
