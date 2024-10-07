import java.util.HashMap;

public class Solution {
    public static String solution(String letter) {
        // 모스 부호와 알파벳 대응표
        HashMap<String, String> morse = new HashMap<>();
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");

        // 공백을 기준으로 모스 부호를 분리하여 해독
        String[] morseLetters = letter.split(" ");
        StringBuilder result = new StringBuilder();

        // 각 모스 부호를 알파벳으로 변환
        for (String morseLetter : morseLetters) {
            result.append(morse.get(morseLetter));
        }

        return result.toString();
    }

}
