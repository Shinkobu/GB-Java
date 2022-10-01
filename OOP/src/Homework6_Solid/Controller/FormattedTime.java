package Homework6_Solid.Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattedTime {
    public static String formattedTime() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = now.format(formatter);
        return formatDateTime;

    }

}
