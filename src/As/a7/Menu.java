package As.a7;

public interface  Menu {
    void  Addstudent(int ID, String name, int age, String address, double gpa);
    void Editstudentbyid(int ID);
    void Deletebyid(int ID);
    void sortbygpa();
    void sortbyname();
    void Showstudent();
    void Exit();

}
