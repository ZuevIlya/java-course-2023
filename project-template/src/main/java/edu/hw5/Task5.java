package edu.hw5;

class Task5 {

    private Task5() {

    }

    public static boolean validateCarPlate(String plate) {
        String regex = "[А-Я]{1}\\d{3}[А-Я]{2}\\d{3}";
        return plate.matches(regex);
    }
}
