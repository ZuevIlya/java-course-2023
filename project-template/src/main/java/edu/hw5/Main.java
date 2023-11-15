package edu.hw5;

import java.time.LocalDate;
import java.util.List;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {


        // Task1
        // Пример входных данных
        List<String> input = List.of(
            "2022-03-12, 20:20 - 2022-03-12, 23:50",
            "2022-04-01, 21:30 - 2022-05-02, 03:20"
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

        /*

        // Task4
        String password1 = "securePassword";
        String password2 = "strongPassword@123";

        System.out.println(Task4.validatePassword(password1)); // Вывод: false
        System.out.println(Task4.validatePassword(password2)); // Вывод: true

        // Task5
        String plate1 = "А123ВЕ777";
        String plate2 = "О777ОО177";
        String plate3 = "123АВЕ777";
        String plate4 = "А123ВГ77";
        String plate5 = "А123ВЕ7777";

        System.out.println(Task5.validateCarPlate(plate1)); // Вывод: true
        System.out.println(Task5.validateCarPlate(plate2)); // Вывод: true
        System.out.println(Task5.validateCarPlate(plate3)); // Вывод: false
        System.out.println(Task5.validateCarPlate(plate4)); // Вывод: false
        System.out.println(Task5.validateCarPlate(plate5)); // Вывод: false

        // Task6
        String T = "achfdbaabgabcaabg";
        String S = "abc";

        boolean isSubsequence = Task6.isSubsequence(S, T);

        if (isSubsequence) {
            System.out.println(S + " является подпоследовательностью " + T);
        } else {
            System.out.println(S + " не является подпоследовательностью " + T);
        }

        // Task7

        String line1 = "110113";
        System.out.println(Task7.getMatchingStrings1(line1));

        String line2 = "0";
        System.out.println(Task7.getMatchingStrings2(line2));

        String line3 = "112";
        System.out.println(Task7.getMatchingStrings3(line3));

         */
    }
}
