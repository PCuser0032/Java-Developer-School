package ru.deniskozlov.javadeveloperschool2023.hw_2023_12_21.exercise1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // guide: 1, magic: 2, emotion: 1, goal: 4, surface: 1, coffee: 2, mirror: 1, question: 1, window: 1, book: 1, house: 1, volt: 1, community: 1, yellow: 1, music: 1
        String[] words = {
                "guide", "magic", "emotion", "goal", "surface", "coffee", "goal", "mirror", "question", "magic",
                "window", "goal", "book", "house", "coffee", "volt", "goal", "community", "yellow", "music"
        };

        List<String> uniqueWordList = new ArrayList<>();

        for (String word : words) {
            if (!uniqueWordList.contains(word)) {
                uniqueWordList.add(word);
            } else {
                uniqueWordList.remove(word);
            }
        }

        System.out.format("Unique words: %s%s%s", uniqueWordList, '\n', '\n');

        Map<String, Integer> wordToCount = new HashMap<>();

        for (String word : words) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }

        System.out.println("Words count:");

        for (String word : wordToCount.keySet()) {
            System.out.println(word + ": " + wordToCount.get(word));
        }
    }
}
