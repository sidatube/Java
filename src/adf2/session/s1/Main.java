package adf2.session.s1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static  void main(String[] args){
//        HashSet<String> hsstring= new HashSet<>(); // giong list nhungw ko dc lap
//        hsstring.add("Hilo");
//        hsstring.add("hepypola");
//        hsstring.add("Hilo");
//        for (String x:hsstring
//             ) {
//            System.out.println(x);
//        }
//         Nhap 1 mang 10 so khong trung nhau.
//        HashSet<Integer> randomar = new HashSet<>();
//        Scanner sc = new Scanner(System.in);
//        while (randomar.size() < 10){
//            System.out.println("Nhap 1 so");
//            randomar.add(sc.nextInt());
//        }
//            System.out.println("Sau khi nhap");
//        for (Integer x:randomar
//             ) {
//            System.out.println(x);
//        }
//        PriorityQueue<String> prarr=new PriorityQueue<>();
//        prarr.add("hello");
//        prarr.add("ac");
//        prarr.add("vsg");
//        prarr.add("xin chao");
//        prarr.add("aaa");
//        for (String x: prarr){
//            System.out.println(x);
//        }
        PriorityQueue<Cat> cpr= new PriorityQueue<>();// xep hang cho
        cpr.add(new Cat("baa",8));
        cpr.add(new Cat("asv",5));
        cpr.add(new Cat("dfu",9));
        cpr.add(new Cat("cju",6));
        Iterator<Cat> i = cpr.iterator();
        while (i.hasNext()){
            Cat x = i.next();
            System.out.println(x.name+"-"+x.age);
            i.remove();
        }

        HashMap<String,String > hmar= new HashMap<>();
        hmar.put("T2008M","Hoc hoc sang");
        hmar.put("T1907A","Hoc hoc chieu");

        System.out.println(hmar.get("T2008M"));

    }

}
