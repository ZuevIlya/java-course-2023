package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Task6 {

    private Task6() {

    }

    public static boolean isSubsequence(String s, String t) {
        String regex = ".*" + Pattern.quote(s) + ".*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(t);
        return matcher.matches();
    }
}
