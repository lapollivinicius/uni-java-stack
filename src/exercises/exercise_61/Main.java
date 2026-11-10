package src.exercises.exercise_61;

public class Main {

    public static void main(String[] args) {

        String phrase = " Pineapple are ugly today ";

        System.out.println("WORDS: " + Validate.countWords(phrase));
        System.out.println("CONSONANTS: " + Validate.countConsonants(phrase));
        System.out.println("VOWELS: " + Validate.countVowels(phrase));
        System.out.println("LETTERS: " + Validate.countCharacters(phrase));
        System.out.println("SPACES: " + Validate.countSpaces(phrase));

    }

}
