package edu.hw7.Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 implements PersonDatabase {
    private final Map<Integer, Person> personMap; // Коллекция для хранения данных о людях
    private final Map<String, List<Integer>> nameIndex; // Обратный индекс по имени
    private final Map<String, List<Integer>> addressIndex; // Обратный индекс по адресу
    private final Map<String, List<Integer>> phoneNumberIndex; // Обратный индекс по номеру телефона

    public Task3() {
        this.personMap = new HashMap<>();
        this.nameIndex = new HashMap<>();
        this.addressIndex = new HashMap<>();
        this.phoneNumberIndex = new HashMap<>();
    }

    @Override
    public synchronized void add(Person person) {
        // Добавляем человека в коллекцию
        personMap.put(person.id(), person);

        // Добавляем индексированные значения в соответствующие обратные индексы
        addToIndex(nameIndex, person.name(), person.id());
        addToIndex(addressIndex, person.address(), person.id());
        addToIndex(phoneNumberIndex, person.phoneNumber(), person.id());
    }

    @Override
    public synchronized void delete(int id) {
        // Удаляем человека из коллекции
        Person person = personMap.remove(id);

        // Удаляем индексированные значения из соответствующих обратных индексов
        removeFromIndex(nameIndex, person.name(), id);
        removeFromIndex(addressIndex, person.address(), id);
        removeFromIndex(phoneNumberIndex, person.phoneNumber(), id);
    }

    @Override
    public synchronized List<Person> findByName(String name) {
        return findByAttribute(nameIndex, name);
    }

    @Override
    public synchronized List<Person> findByAddress(String address) {
        return findByAttribute(addressIndex, address);
    }

    @Override
    public synchronized List<Person> findByPhone(String phone) {
        return findByAttribute(phoneNumberIndex, phone);
    }

    // Вспомогательный метод для добавления значения в обратный индекс
    private void addToIndex(Map<String, List<Integer>> index, String value, int id) {
        index.computeIfAbsent(value, k -> new ArrayList<>()).add(id);
    }

    // Вспомогательный метод для удаления значения из обратного индекса
    private void removeFromIndex(Map<String, List<Integer>> index, String value, int id) {
        List<Integer> ids = index.get(value);
        if (ids != null) {
            ids.remove(Integer.valueOf(id));
            if (ids.isEmpty()) {
                index.remove(value);
            }
        }
    }

    // Вспомогательный метод для поиска по обратному индексу
    private List<Person> findByAttribute(Map<String, List<Integer>> index, String attribute) {
        List<Person> result = new ArrayList<>();
        List<Integer> ids = index.get(attribute);
        if (ids != null) {
            for (int id : ids) {
                result.add(personMap.get(id));
            }
        }
        return result;
    }
}
