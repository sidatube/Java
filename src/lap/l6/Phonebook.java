package lap.l6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Phonebook extends Phone{
    ArrayList<ListP> phoneList;

    public Phonebook() {
        phoneList=new ArrayList<ListP>();
    }

    @Override
    public void insertPhone(String name, String phone) {
        for(ListP p: phoneList){
            if (p.getName().equals(name)){ // so sanh 2 string
                if (!p.getPhone().contains(phone)) {// kiem tra co trong danh sach hay chua
                    p.addPhone(phone);
                }
            }
            return;
        }
        ListP p = new ListP(name,phone);
        phoneList.add(p);

    }

    @Override
    public void removePhone(String name) {
        for (ListP p: phoneList
             ) {
            if (p.getName().equals(name)){
                phoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for (ListP p: phoneList
             ) {
            if (p.getName().equals(name)){
                p.addPhone(newPhone);
                return;
            }
        }

    }

    @Override
    public void searchPhone(String name) {
        for (ListP p: phoneList
             ) {
            if (p.getName().equals(name)) {
                System.out.println("Da tim thay");
                return;
                }
            }
    }

    @Override
    public void sort() {
        Collections.sort(phoneList, new Comparator<ListP>() {
            @Override
            public int compare(ListP o1, ListP o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
