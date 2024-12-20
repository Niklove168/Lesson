package Lesson5;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String[] words = {"Dog", "Cat", "Mouse", "Cat", "Sheep", "Horse",
                "Mouse", "Pig", "Dog", "Sheep", "Dog", "Cat", "Cow",
                "Sheep", "Goat", "Dog", "Pig"};
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String word : words) {
            wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Unique words: ");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
        System.out.println("\n Number of words repeated: ");
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}