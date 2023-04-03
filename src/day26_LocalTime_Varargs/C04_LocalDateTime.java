package day26_LocalTime_Varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C04_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

        System.out.println(ldt.toLocalDate());

    }
}
