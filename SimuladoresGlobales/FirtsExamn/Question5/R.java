package SimuladoresGlobales.FirtsExamn.Question5;

import java.time.*;
import java.time.format.DateTimeFormatter;

class R{
    public static void main(String[] args) {
        LocalDateTime dt =  LocalDateTime.of(2014, 07, 31, 1, 1);
        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
        //2014-07-31
    }
}