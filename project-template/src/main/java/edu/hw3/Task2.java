package edu.hw3;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Task2 {

    private Task2() {

    }

    public static List<String> clusteringBrackets(String brackets) {
        List<String> arrayOfBrackets = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        StringBuilder string = new StringBuilder("");
        for (char letter: brackets.toCharArray()) {
            if ((letter == '(') || (letter == ')')) {
                switch (letter) {
                    case ('('):
                        stack.add(letter);
                        string.append(letter);
                        break;
                    case (')'):
                        if (!stack.isEmpty()) {
                            string.append(letter);
                            stack.pop();
                        } else {
                            arrayOfBrackets.add(String.valueOf(string));
                            string = new StringBuilder();
                        }
                        break;
                    default:
                        return null;
                }
            } else {
                return null;
            }
        }
        return arrayOfBrackets;
    }
}
