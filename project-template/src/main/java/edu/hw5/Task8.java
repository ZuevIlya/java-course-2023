package edu.hw5;

class Task8 {

    private Task8() {

    }

    public static boolean getMatchingStrings1(String string) {
        String regex = "^[01]*[01]$";
        return string.matches(regex);
    }

    public static boolean getMatchingStrings2(String string) {
        String regex = "^(0[01]*1|[01]*0)$";
        return string.matches(regex);
    }

    public static boolean getMatchingStrings3(String string) {
        String regex = "^(1*01*01*)*$";
        return string.matches(regex);
    }

    public static boolean getMatchingStrings4(String string) {
        String regex = "^(?!11$|111$)[01]*$";
        return string.matches(regex);
    }

    public static boolean getMatchingStrings5(String string) {
        String regex = "^[01]*1[01]*1[01]*$";
        return string.matches(regex);
    }

    public static boolean getMatchingStrings6(String string) {
        String regex = "^(.*0.*){2,}([^1]*1[^1]*)?$";
        return string.matches(regex);
    }

    public static boolean getMatchingStrings7(String string) {
        String regex = "^(?!.*11)[01]*$";
        return string.matches(regex);
    }
}
