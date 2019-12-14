import java.util.Scanner;

public class SearchingStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence and press enter ");
        String sentence = input.nextLine();
        System.out.println("Enter char and press enter ");
        String inputCharacter = input.next();
        char character = inputCharacter.charAt(0);
        System.out.printf("number of occurrences of the character %c in the text \"%s\" is %d",
                character,
                sentence,
                searchChar(sentence, character));
    }

    public static int searchChar(String sentence, char character) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            sentence = sentence.substring(sentence.indexOf(character, i));
            i = 0;
            count++;
        }
        return count;
    }

}
