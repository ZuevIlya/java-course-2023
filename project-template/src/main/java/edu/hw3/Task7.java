package edu.hw3;

import java.util.Comparator;
import java.util.TreeMap;

class Task7 {
    static TreeMap<String, String> tree = new TreeMap<>(Comparator.nullsFirst(nullFirstComparator()));


    private Task7() {

    }

    public static void add(String key, String text) {
        tree.put(key, text);
    }

    public static Comparator<String> nullFirstComparator() {
        return Comparator.naturalOrder();
    }

}
