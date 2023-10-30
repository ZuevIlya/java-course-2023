package edu.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

class Task5 {

    private Task5() {

    }

    public static List<Person> parseContacts(List<String> names, String typeOfSort) {
        if (names == null) {
            return new ArrayList<>();
        }

        List<Person> persons = new LinkedList<>();
        for (String name: names) {
            String[] parts = name.split(" ");
            if (parts.length == 1) {
                persons.add(new Person(parts[0], null));
            } else {
                persons.add(new Person(parts[0], parts[1]));
            }
        }

        Collections.sort(persons);
        if (typeOfSort.equals("DESC")) {
            Collections.reverse(persons);
        }
        return persons;
    }

    public record Person(String name, String secondName) implements Comparable<Person> {
        @Override
        public String toString() {
            StringBuilder string = new StringBuilder(this.name);
            if (this.secondName != null) {
                string.append(" ").append(this.secondName);
            }
            return String.valueOf(string);
        }

        @Override
        public int compareTo(@NotNull Task5.Person person) {
            if ((secondName == null) && (person.secondName() == null)) {
                return name.compareTo(person.name());
            }
            if (secondName == null) {
                return name.compareTo(person.secondName());
            }
            if (person.secondName == null) {
                return secondName.compareTo(person.name());
            }
            return secondName.compareTo(person.secondName());
        }
    }
}
