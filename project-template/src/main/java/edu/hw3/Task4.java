package edu.hw3;

class Task4 {
    private static final String[] ROMAN_NUMERALS = new String[] {"M", "CM", "D", "CD", "C", "XC",
        "L", "XL", "X", "IX", "V", "IV", "I" };
    private static final int[] ARABIC_NUMERALS = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

    private Task4() {

    }

    public static StringBuilder convertToRoman(int number) {
        if (number <= 0) {
            return new StringBuilder("-1");
        }
        StringBuilder result = new StringBuilder();
        int index = 0;

        while (index < ROMAN_NUMERALS.length) {
            while (number >= ARABIC_NUMERALS[index]) {
                var divider = number / ARABIC_NUMERALS[index];
                number = number % ARABIC_NUMERALS[index];
                result.append(ROMAN_NUMERALS[index].repeat(divider));
            }
            index = index + 1;
        }
        return result;
    }
}
