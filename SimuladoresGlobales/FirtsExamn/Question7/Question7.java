package SimuladoresGlobales.FirtsExamn.Question7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question7{
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, 6, 20);
        LocalDate date3 = LocalDate.parse("2014-04-06", DateTimeFormatter.ISO_DATE);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}