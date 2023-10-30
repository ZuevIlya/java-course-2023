package edu.hw3;

class Task1 {
    private static final int LOWER_BOUND_FOR_UPPER_CASE = 65;
    private static final int UPPER_BOUND_FOR_UPPER_CASE = 90;
    private static final int LOWER_BOUND_FOR_LOWER_CASE = 97;
    private static final int UPPER_BOUND_FOR_LOWER_CASE = 122;

    private Task1() {

    }

    public static StringBuilder textEncryption(String text) {
        StringBuilder resultString = new StringBuilder();
        for (char c : text.toCharArray()) {
            char newChar = c;
            if ((c >= LOWER_BOUND_FOR_UPPER_CASE) && (c <= UPPER_BOUND_FOR_UPPER_CASE)) {
                newChar = getMirroredLetter(c, LOWER_BOUND_FOR_UPPER_CASE, UPPER_BOUND_FOR_UPPER_CASE);
            } else if ((c >= LOWER_BOUND_FOR_LOWER_CASE) && (c <= UPPER_BOUND_FOR_LOWER_CASE)) {
                newChar = getMirroredLetter(c, LOWER_BOUND_FOR_LOWER_CASE, UPPER_BOUND_FOR_LOWER_CASE);
            }
            resultString.append(newChar);
        }
        return resultString;
    }

    private static char getMirroredLetter(char letter, int lowerBound, int upperBound) {
        int distanceToTheUpperBound = upperBound - letter;
        int distanceToTheLowerBound = letter - lowerBound;
        int result = distanceToTheUpperBound - distanceToTheLowerBound;
        return  (char) (letter + result);
    }
}
