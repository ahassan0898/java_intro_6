package data_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class _01_LocalDateTime {
    public static void main(String[] args) {
        System.out.println("\n----------LocalDate------\n");
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate); // 2023 -05-02

        // MM/dd/yyyy
        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"))); //05/02/2023
        System.out.println(currentDate.plusYears(2)); // 2025-05-02
        System.out.println(currentDate.minusDays(5)); // 2025-04-27 subtracts days from current date


        System.out.println("\n-------------LocalTime------\n");
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        System.out.println("\n----------LocalDateTime-----------\n");
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime.format(DateTimeFormatter.ofPattern("MMM d, h:mm a")));


        System.out.println(currentDateTime); // 2023-05-02T18:16:11.107 yyyy-MM-ddThh:mm:ss.SSS


    }
}
