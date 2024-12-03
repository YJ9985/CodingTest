import java.util.*;

class Solution {
    public long solution(String numbers) {
        Map<String, String> wordToNumberMap = new HashMap<>();
        wordToNumberMap.put("one", "1");
        wordToNumberMap.put("two", "2");
        wordToNumberMap.put("three", "3");
        wordToNumberMap.put("four", "4");
        wordToNumberMap.put("five", "5");
        wordToNumberMap.put("six", "6");
        wordToNumberMap.put("seven", "7");
        wordToNumberMap.put("eight", "8");
        wordToNumberMap.put("nine", "9");
        wordToNumberMap.put("zero", "0");

        for (String word : wordToNumberMap.keySet()) {
            numbers = numbers.replace(word, wordToNumberMap.get(word));
        }

        return Long.parseLong(numbers);
    }
}
