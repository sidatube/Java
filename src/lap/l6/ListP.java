package lap.l6;

import java.util.ArrayList;

public class ListP {
    String name;
    ArrayList<String> phone;

    public ListP(String name, String phone) {
        this.name = name;
        this.phone = new ArrayList<String>();
        this.phone.add(phone) ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }

    public void addPhone(String phone) {
        this.phone.add(phone);
    }
}
