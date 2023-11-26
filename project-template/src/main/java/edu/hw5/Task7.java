package edu.hw5;

class Task7 {

    private Task7() {

    }

    public static boolean getMatchingStrings1(String string) {
        String regex1 = "^[01]{2}0[01]*$";
        return string.matches(regex1);
    }

    public static boolean getMatchingStrings2(String string) {
        String regex2 = "^(0|1)[01]*\\1$";
        return string.matches(regex2);
    }

    public static boolean getMatchingStrings3(String string) {
        String regex3 = "^[01]{1,3}$";
        return string.matches(regex3);
    }
}
