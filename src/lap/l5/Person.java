package lap.l5;

import javax.lang.model.element.NestingKind;
import java.util.Date;

public class Person {
    String name;
    String sex;
    String date;
    String diaChi;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void print(){
        System.out.println("Ho va ten: "+this.getName());
        System.out.println("Gioi tinh: "+this.getSex());
        System.out.println("Ngay sinh"+this.getDate());
        System.out.println("Dia chi: "+this.getDiaChi());
    }
}
