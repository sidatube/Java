package lap.l5;

public class Student extends Person{
    int code;
    double diem;
    String mail;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    public void print() {
        super.print();
        System.out.println("Ma so: "+this.getCode());
        System.out.println("Diem thi: "+this.getDiem());
        System.out.println("Email: "+this.getMail());
    }
    public boolean hocBong(){
        if (this.getDiem()>8.0){
            return true;
        }return false;
    }
}
