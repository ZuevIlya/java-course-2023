package edu.hw5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

class Task3 {

    private Task3() {

    }

    public static Optional<LocalDate> parseDate(String input) {
        try {
            // Попытка распарсить дату с использованием различных форматов
            LocalDate date = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return Optional.of(date);
        } catch (Exception e) {
            try {
                LocalDate date = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-M-d"));
                return Optional.of(date);
            } catch (Exception ignored) {
                // Продолжаем с другими форматами
            }
        }

        // Обработка особых случаев
        if (input.equalsIgnoreCase("tomorrow")) {
            return Optional.of(LocalDate.now().plusDays(1));
        } else if (input.equalsIgnoreCase("today")) {
            return Optional.of(LocalDate.now());
        } else if (input.equalsIgnoreCase("yesterday")) {
            return Optional.of(LocalDate.now().minusDays(1));
        } else if (input.matches("\\d+ days? ago")) {
            int daysAgo = Integer.parseInt(input.split(" ")[0]);
            return Optional.of(LocalDate.now().minusDays(daysAgo));
        }

        // Если ни один из форматов не подошел
        return Optional.empty();
    }
}
