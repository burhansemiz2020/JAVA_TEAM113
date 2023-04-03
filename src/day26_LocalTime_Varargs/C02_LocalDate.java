package day26_LocalTime_Varargs;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih= LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.isLeapYear());

        LocalDate tarih2=LocalDate.of(2020,10,10);
        System.out.println(tarih2.isLeapYear());

        System.out.println(tarih.plusWeeks(20).plusDays(2));
        System.out.println(tarih.minusMonths(3).minusDays(3));

        System.out.println(tarih.withYear(1923).withMonth(5));
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getMonthValue());
        LocalDate tarih3=LocalDate.of(1980,1,1);
        System.out.println(tarih3.getDayOfWeek());
        System.out.println(tarih.isBefore(tarih3));
        System.out.println(tarih.isAfter(tarih3));

    }
}
