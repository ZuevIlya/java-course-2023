package edu.hw5;

class Task4 {

    private Task4() {

    }

    public static boolean validatePassword(String password) {
        String regex = ".*[~!@#$%^&*|].*";
        return password.matches(regex);
    }
}
