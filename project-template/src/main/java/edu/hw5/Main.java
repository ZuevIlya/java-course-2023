package edu.hw5;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Task1
        // Пример входных данных
        List<String> input = List.of(
            "2022-03-12, 20:20 - 2022-03-12, 23:50",
            "2022-04-01, 21:30 - 2022-04-02, 01:20"
        );

        // Вызов функции для подсчета среднего времени
        String averageTime = Task1.calculateAverageTime(input);

        // Вывод результата
        System.out.println("Среднее время посещения: " + averageTime);

        // Task2
        int year = 1925;
        List<LocalDate> fridaysOn13th = Task2.findFridaysOn13th(year);
        System.out.println("Пятницы 13-е в " + year + ": " + fridaysOn13th);

        LocalDate date = LocalDate.of(2023, 5, 20); // Пример заданной даты
        LocalDate nextFriday13th = Task2.findNextFriday13th(date);
        System.out.println("Следующая ближайшая пятница 13: " + nextFriday13th);

        // Task3
        System.out.println(Task3.parseDate("2020-10-10"));
        System.out.println(Task3.parseDate("2020-12-2"));
        System.out.println(Task3.parseDate("1/3/1976"));
        System.out.println(Task3.parseDate("1/3/20"));
        System.out.println(Task3.parseDate("tomorrow"));
        System.out.println(Task3.parseDate("today"));
        System.out.println(Task3.parseDate("yesterday"));
        System.out.println(Task3.parseDate("1 day ago"));
        System.out.println(Task3.parseDate("2234 days ago"));
        System.out.println(Task3.parseDate("invalid date format"));

        // Task4
        String password1 = "securePassword";
        String password2 = "strongPassword@123";

        System.out.println(Task4.validatePassword(password1)); // Вывод: false
        System.out.println(Task4.validatePassword(password2)); // Вывод: true
    }
}
