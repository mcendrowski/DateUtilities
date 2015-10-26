/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateutilities;

import static dateutilities.DateUtilities.dateTimeToString;
import static dateutilities.DateUtilities.dateToString;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author MCENDROWSKI
 */
public class TestOfDateUtilities {
   
    public static void main(String[] args) {
         System.out.println(dateToString(LocalDate.now(), "MMMM dd',' yyyy"));
        System.out.println(dateTimeToString(LocalDateTime.now(), "MMMM dd',' yyyy HH':'mm"));
//        System.out.println(Duration.between(LocalDate.now(), LocalDate.now().plusDays(3)));
//        Duration a = Duration.between(LocalDate.now(), LocalDate.now().plusDays(3));
//        System.out.println(a);
        
//        Duration diff = Duration.between(LocalDate.now(), LocalDate.now().plusDays(3));
//        System.out.println(diff.toHours());
        
//        LocalDateTime startDate = LocalDateTime.now();
//        
//         // Solution #1
//        LocalDateTime endDate = startDate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
//        System.out.println(startDate.until(endDate, ChronoUnit.HOURS));
        
        LocalDateTime startDate = LocalDateTime.now();
        LocalDateTime endDate = LocalDateTime.now().plusDays(3);
        
//        LocalDateTime startDate = LocalDateTime.now();
//        LocalDateTime endDate = LocalDateTime.now().plusHours(4);
        
        
        
        System.out.println("Minutes between: "+DateUtilities.minutesBetween(startDate, endDate));
        
        System.out.println(dateTimeToString(startDate,"aaa"));
        
        
        
//        Duration diff = Duration.between(startDate, endDate);
//        System.out.println(diff.toMinutes());
//        
//        startDate.adjustInto(endDate);
//        System.out.println(startDate);
//        System.out.println(startDate.adjustInto(endDate));
//        
//        System.out.println(endDate);
//        
//        System.out.println(startDate.atOffset(ZoneOffset.UTC));
        
        
        
//        startDate.
        
    }
}
