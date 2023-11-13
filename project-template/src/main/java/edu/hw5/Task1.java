package edu.hw5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

class Task1 {

    private Task1() {

    }

    public static String calculateAverageTime(List<String> sessions) {
        long totalSeconds = 0;

        for (String session : sessions) {
            String[] sessionParts = session.split(" - ");

            LocalDateTime startTime = LocalDateTime.parse(sessionParts[0], DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm"));
            LocalDateTime endTime = LocalDateTime.parse(sessionParts[1], DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm"));

            Duration duration = Duration.between(startTime, endTime);
            totalSeconds += duration.getSeconds();
        }

        long averageSeconds = totalSeconds / sessions.size();

        long hours = averageSeconds / 3600;
        long minutes = (averageSeconds % 3600) / 60;

        return hours + "ч " + minutes + "м";
    }
}
