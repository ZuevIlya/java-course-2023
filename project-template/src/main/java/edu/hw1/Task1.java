package edu.hw1;

public class Task1 {
    private static final int SEC_IN_MINUTE = 60;

    private Task1() {

    }

    public static int minutesToSeconds(String time) {
        String[] parts = time.split(":");
        if ((!time.contains(":")) || (time.contains("-")) || (parts[0].isEmpty()) || (parts[1].isEmpty())) {
            return -1;
        }
        int min = Integer.parseInt(parts[0]);
        int sec = Integer.parseInt(parts[1]);
        if (sec >= SEC_IN_MINUTE) {
            return -1;
        } else {
            return (min * SEC_IN_MINUTE + sec);
        }
    }
}
