import java.util.Random;
import java.util.Scanner;

public class RandomSentences {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String[] names = {"Peter", "Michell", "Jane", "Steve", "Svetlin", "Boris", "Pavel", "Svilen", "Nikolina"};
        String[] places = {"Sofia", "Plovdiv", "Varna", "Burgas", "Dobrich", "Kranevo", "Vidin", "London"};
        String[] verbs = {"eats", "holds", "sees", "plays with", "brings", "sleep", "walk", "run", "pumping"};
        String[] nouns = {"stones", "cake", "apple", "laptop", "bikes", "house", "car", "airplane", "spaceship"};
        String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly", "fastly", "coldly"};
        String[] details = {"near the river", "at home", "in the park", "in the car", "in the club", "in my pocket"};

        System.out.println("Hello, this is your first random-generated sentence: ");
        System.out.println("Click [Enter] to generate: ");

        String userInput = reader.nextLine();

        while (userInput != null) {
            String randomName = getRandomWord(names);
            String randomPlaces = getRandomWord(places);
            String randomVerbs = getRandomWord(verbs);
            String randomNouns = getRandomWord(nouns);
            String randomAdverbs = getRandomWord(adverbs);
            String randomDetails = getRandomWord(details);

            System.out.printf("%s from %s %s %s %s %s %n", randomName, randomPlaces, randomVerbs, randomNouns, randomAdverbs, randomDetails);
            System.out.println("Click [Enter] to generate a new one");

            userInput = reader.nextLine();
        }

    }
    public static String getRandomWord(String[] words) {
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }
}