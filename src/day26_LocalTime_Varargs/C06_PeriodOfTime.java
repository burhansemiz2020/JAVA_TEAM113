package day26_LocalTime_Varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

import static java.time.LocalDateTime.of;

public class C06_PeriodOfTime {
    public static void main(String[] args) {
        /*
        Iki tarih arasindaki gecen sureyi yil ay gun olarak almak
        istiyorsaniz.
         */
        LocalDate dogumTarihi= LocalDate.of(1980,1,1);
        LocalDate bugun=LocalDate.now();
        System.out.println(dogumTarihi.until(bugun));

        System.out.println("Yas : "+Period.between(dogumTarihi,bugun).getYears());
        System.out.println("Ay : "+Period.between(dogumTarihi,bugun).getMonths());
        System.out.println("Gün : "+Period.between(dogumTarihi,bugun).getDays());



    }
}
