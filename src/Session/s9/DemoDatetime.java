package Session.s9;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DemoDatetime {
    public static void main(String[] args){
//        LocalDate ld= LocalDate.now();//ngay hom this
//        System.out.println("Hom nay la: "+ ld);
//        System.out.println("Ngay mai la: "+ ld.plusDays(1));
//        System.out.println("Ngay nay nam sau la: "+ ld.plusYears(1));
//        System.out.println("Ngay nay nam truoc la: "+ ld.minusYears(1));
//        System.out.println("Thang nay  la thang: "+ ld.getMonthValue());
//        LocalDate k2x = LocalDate.parse("1990-10-26");
//        System.out.println("Hom do la thu "+k2x.getDayOfWeek());
//        System.out.println("Hom do la ngay thu "+k2x.getDayOfYear());
//        System.out.println("Nam: "+k2x.getYear());
////        k2x.compareTo(ld);
//        LocalDate k3=LocalDate.of(2000,12,24);
//        //

//        LocalDate n1 = LocalDate.of(2001,12,31);
//        System.out.println("Nam nhuan");
//        while (n1.getYear()<2101){
//            if (n1.getDayOfYear()==366){
//                System.out.println(n1.getYear());
//            }
//            n1 =n1.plusYears(1);
//        }
//        LocalDate t1 = LocalDate.of(2001,2,28);
//        System.out.println("Nam nhuan");
//        while (t1.getYear()<2101){
//            if (t1.plusDays(1).getDayOfMonth()==29){
//                System.out.println(t1.getYear());
//            }
//            t1 =t1.plusYears(1);
//        }
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Ima da: "+ dt);
        System.out.println("Them ti nua "+dt.plusHours(1));
        System.out.println("Them teo nua "+dt.plusMinutes(1));
        System.out.println("Them ti teo nua "+dt.plusSeconds(1));
        System.out.println("Them ti teo teo teo nua "+dt.plusNanos(1));



    }
}
