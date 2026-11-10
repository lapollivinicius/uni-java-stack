package src.exercises.exercise_61;

public class Validate {

    public static int countCharacters(String str) {
        return str.replaceAll("\\s", "").length();
    }

    public static int countWords(String str) {
        return str.trim().split("\\s+").length;
    }

    public static int countVowels(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").trim().length();
    }

    public static int countConsonants(String str) {
        return str.replaceAll("(?i)[b-df-hj-np-tv-z]*", "").trim().length();
    }

    public static int countSpaces(String str) {
        return str.replaceAll("\\S*", "").length();
    }


}
