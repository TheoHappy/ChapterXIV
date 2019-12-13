import java.util.Scanner;

public class DisplayingSentenceWithItsWordsReversed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence and press enter ");
        String sentence = input.nextLine();
        String[] tokens = sentence.split(" ");

        System.out.println("Same order of tokens and reverse order of chars in tokens ");
        for (String token : tokens) {
            System.out.print(reverseToken(token) + " ");
        }

        System.out.println();
        System.out.println("Reverse order of tokens and reverse order of chars in tokens: ");

        for (int i = tokens.length-1; i >=0; i--){
            System.out.print(reverseToken(tokens[i]) + " ");
        }
    }

    public static String reverseToken(String token){
        String output = "";

        for (int i = token.length() - 1; i >= 0; i--)
            output += token.charAt(i);

        return output;
    }
}
