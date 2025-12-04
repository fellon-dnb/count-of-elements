package com.fellon.counter;


import java.util.HashMap;
import java.util.Map;

public class ElementCounter {
    static String[] words = {"a", "b", "a", "c", "b", "a", "1", "B", "A", "B", "A"};

    public static <T> Map<T, Integer> countValues(T[] array) {
        Map<T, Integer> map = new HashMap<>();
        for (T element : array) {
            map.put(element, map.getOrDefault(element, 0) + 1);

        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, Integer> result = getResult();
        System.out.println(result);
    }

    private static Map<String, Integer> getResult() {
        return countValues(words);
    }
}
