package src.challenges.hangman_game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Words {

    public static String getWord() {
        List<String> listWords = new ArrayList<>();
        Path path = Path.of("src/challenges/hangman_game/words.txt").toAbsolutePath();
        try (
                FileReader file = new FileReader(path.toFile(), Charset.defaultCharset());
                BufferedReader buffer = new BufferedReader(file)
        ) {

            String word = buffer.readLine();
            while (word != null) {
                listWords.add(word);
                word = buffer.readLine();
            }
        } catch (IOException err) {
            System.out.println(err.getMessage());
            System.exit(1);
        }
        int index = (int) (Math.random() * listWords.size());
        return listWords.get(index);
    }

    public static String updatePlaceholder(String character, List<String> letters, String word) {
        String letter = character.trim().toLowerCase();
        if (letters.contains(letter)) return null;
        letters.add(letter);
        String[] wordSplited = word.split("");
        StringBuilder placeholder = new StringBuilder();
        placeholder.append("-".repeat(wordSplited.length));
        for (int index = 0; index < wordSplited.length; index++) {
            if (letters.contains(wordSplited[index])) {
                placeholder.replace(index, index+1, wordSplited[index]);
            }
        }
        return placeholder.toString();
    }

    public static boolean checkWord(List<String> letters, String word) {
        String[] wordSplited = word.split("");
        for (String letter : wordSplited) {
            if (!letters.contains(letter)) {
                return false;
            }
        }
        return true;
    }

}
