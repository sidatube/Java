package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello world!");
//        int x;
//        x=10;
//        if (x>5){
//            System.out.println(x+" la so duong >5");
//        }else{
//            System.out.println(x+"<=5");
//        }
//        for (int i=0;i<10;i++){
//            System.out.println("i="+i);
//        }
        Student st;// khai bao1 bien cos kieu du lieu student
        st= new Student();// tao doi tuong
        Student st2 = new Student();
        st.name = "Nguyen Du";
        st2.name= "Nguyen Hue";
        st.run();
        st2.run();
    }
}
