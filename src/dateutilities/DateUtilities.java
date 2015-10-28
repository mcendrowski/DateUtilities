/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateutilities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
//import java.time.LocalTime;
import java.time.format.FormatStyle;
import static java.time.temporal.ChronoUnit.DAYS;
import java.time.temporal.TemporalAdjusters;


/**
 * This utility class provides some useful operations on java.time objects
 * With these methods you can output dates to strings in required format.
 * You can also recognize dates from strings.
 * You can also calculate time difference between two dates. 
 * @author MCENDROWSKI
 */
public class DateUtilities {
    
 
//    /**
//     * 
//     * @param localDate
//     * @return
//     * @throws IllegalArgumentException 
//     */
//     static String dateToString(LocalDate localDate) throws IllegalArgumentException {
//        if (localDate==null){
//            throw new IllegalArgumentException("date cannot be null.");
//        }
//        return localDate.format(DateTimeFormatter.ofPattern("MMMM d',' yyyy"));
//    }
      
    /**
     * create a string object from a date, according to a string pattern
     * @param localDate - a LocalDate object
     * @param format - a string representing required format
     * @return returns a string representing a date in a required format     * 
     * @throws IllegalArgumentException when format is not recognized
     * @throws NullPointerException when provided data is null or empty
     */
     public String dateToString(LocalDate localDate, String format) throws IllegalArgumentException,NullPointerException {
        if (localDate==null || format==null || format.isEmpty()){
            throw new NullPointerException("You must provide some input.");
        }
        
        return localDate.format(DateTimeFormatter.ofPattern(format));
    }
     /**
      * creates a string object from a date, according to a string pattern
      * @param localDateTime - a LocalDateTime object
      * @param format - a string representing required format, like in java.time.format.DateTimeFormatter
      * @return returns a string representing a date in a required format
      * @throws IllegalArgumentException when format is not recognized
      * @throws NullPointerException when provided data is null or empty
      */
    public String dateTimeToString(LocalDateTime localDateTime, String format) throws IllegalArgumentException,NullPointerException {
        if (localDateTime==null || format==null || format.isEmpty()){
            throw new NullPointerException("You must provide some input.");
        }
        return localDateTime.format(DateTimeFormatter.ofPattern(format));
    }
    /**
     * creates a LocalDate object from a string representing date, according to a string pattern
     * @param stringDate - a string representing a date
     * @param format - a string representing a pattern, like in java.time.format.DateTimeFormatter
     * @return returns a LocalDate object
     * @throws IllegalArgumentException for null or empty values, or when pattern is wrong
     */
    public LocalDate stringToDate(String stringDate, String format) throws IllegalArgumentException {
        if (stringDate==null || stringDate.isEmpty() || format==null || format.isEmpty()){
            throw new IllegalArgumentException ("You must provide some input");
        }
        return LocalDate.parse(stringDate, DateTimeFormatter.ofPattern(format));
    }
    /**
     * creates a LocalDate object from a string representing date, according to a string pattern
     * @param stringDateTime - a string representing a date
     * @param format - a string representing a pattern, like in java.time.format.DateTimeFormatter
     * @return returns a LocalDateTime object
     * @throws IllegalArgumentException for null or empty values, or when pattern is wrong 
     */
    public LocalDateTime stringToDateTime(String stringDateTime, String format) throws IllegalArgumentException {
        if (stringDateTime==null || stringDateTime.isEmpty() || format==null || format.isEmpty()){
            throw new IllegalArgumentException ("You must provide some input");
        }
        return LocalDateTime.parse(stringDateTime, DateTimeFormatter.ofPattern(format));
    }
    /**
     * calculates time difference in minutes between two dates
     * @param startDate - a LocalDateTime object
     * @param endDate - a LocalDateTime object
     * @return returns time difference in minutes (long type)
     * @throws IllegalArgumentException other illegal argument exceptions
     * @throws NullPointerException when any of the dates is null
     */
    public long minutesBetween(LocalDateTime startDate,LocalDateTime endDate) throws IllegalArgumentException,NullPointerException {
        if (startDate==null || endDate==null){
            throw new NullPointerException("date cannot be null.");
        }
        return Duration.between(startDate, endDate).toMinutes()*60;
    }
    
      public long secondsBetween(LocalDateTime startDate,LocalDateTime endDate) throws IllegalArgumentException,NullPointerException {
        if (startDate==null || endDate==null){
            throw new NullPointerException("date cannot be null.");
        }
        return Duration.between(startDate, endDate).toMinutes()*60;
    }
      
      
    
    
    /**
     * @param args the command line arguments
     */
    public static  void main(String[] args) {
        // TODO code application logic here
       
        
//        System.out.println(dateToString(LocalDate.now(), "MMMM dd',' yyyy"));
//        System.out.println(dateTimeToString(LocalDateTime.now(), "MMMM dd',' yyyy HH':'mm"));
////        System.out.println(Duration.between(LocalDate.now(), LocalDate.now().plusDays(3)));
//        Duration a = Duration.between(LocalDate.now(), LocalDate.now().plusDays(3));
//        System.out.println(a);
        
        LocalDateTime startDate = LocalDateTime.now();
        LocalDateTime endDate = LocalDateTime.now().plusHours(4);
        
//       startDate.with(endDate)
        
//        weekday birthday this year
        
//       dateobject to new datetime object
        
        
                
        
        
    }

}

