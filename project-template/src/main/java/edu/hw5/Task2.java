package edu.hw5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

class Task2 {

    private Task2() {

    }

    public static List<LocalDate> findFridaysOn13th(int year) {
        List<LocalDate> fridaysOn13th = new ArrayList<>();

        for (int month = 1; month <= 12; month++) {
            LocalDate date = LocalDate.of(year, month, 13);
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                fridaysOn13th.add(date);
            }
        }

        return fridaysOn13th;
    }

    public static LocalDate findNextFriday13th(LocalDate date) {
        return date.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY))
            .with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.FRIDAY));
    }
}
