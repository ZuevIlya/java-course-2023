package edu.hw7.Task3A;

import java.util.*;
import java.util.concurrent.locks.*;

public class Task3A implements PersonDatabase {
    private final Map<Integer, Person> cache = new HashMap<>();
    private final Map<String, List<Integer>> nameIndex = new HashMap<>();
    private final Map<String, List<Integer>> addressIndex = new HashMap<>();
    private final Map<String, List<Integer>> phoneIndex = new HashMap<>();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public void add(Person person) {
        lock.writeLock().lock();
        try {
            cache.put(person.id(), person);
            updateIndex(nameIndex, person.name(), person.id());
            updateIndex(addressIndex, person.address(), person.id());
            updateIndex(phoneIndex, person.phoneNumber(), person.id());
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void delete(int id) {
        lock.writeLock().lock();
        try {
            Person person = cache.remove(id);
            if (person != null) {
                removeFromIndex(nameIndex, person.name(), id);
                removeFromIndex(addressIndex, person.address(), id);
                removeFromIndex(phoneIndex, person.phoneNumber(), id);
            }
        } finally {
            lock.writeLock().unlock();
        }
    }

    public List<Person> findByName(String name) {
        lock.readLock().lock();
        try {
            List<Integer> ids = nameIndex.get(name);
            return getPersons(ids);
        } finally {
            lock.readLock().unlock();
        }
    }

    public List<Person> findByAddress(String address) {
        lock.readLock().lock();
        try {
            List<Integer> ids = addressIndex.get(address);
            return getPersons(ids);
        } finally {
            lock.readLock().unlock();
        }
    }

    public List<Person> findByPhone(String phone) {
        lock.readLock().lock();
        try {
            List<Integer> ids = phoneIndex.get(phone);
            return getPersons(ids);
        } finally {
            lock.readLock().unlock();
        }
    }

    private void updateIndex(Map<String, List<Integer>> index, String key, int id) {
        List<Integer> ids = index.computeIfAbsent(key, k -> new ArrayList<>());
        ids.add(id);
    }

    private void removeFromIndex(Map<String, List<Integer>> index, String key, int id) {
        List<Integer> ids = index.get(key);
        if (ids != null) {
            ids.remove(Integer.valueOf(id));
        }
    }

    private List<Person> getPersons(List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return Collections.emptyList();
        }
        List<Person> persons = new ArrayList<>();
        for (int id : ids) {
            Person person = cache.get(id);
            if (person != null) {
                persons.add(person);
            }
        }
        return persons;
    }
}

