import java.util.Scanner;

public class SearchingStrings {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence and press enter ");
        String sentence = input.nextLine();
        System.out.println("Enter char and press enter ");
        String inputCharacter = input.next();
        char character = inputCharacter.charAt(0);
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.indexOf(character, i) > 0){
                count++;
            }
//            System.out.println(sentence.indexOf(character,i));
        }
        System.out.printf("number of occurrences of the character %c in the text \"%s\" is %d",character,sentence,count);
    }
}
