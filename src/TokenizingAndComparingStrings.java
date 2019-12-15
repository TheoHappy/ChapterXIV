import java.util.Scanner;

public class TokenizingAndComparingStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence and press enter ");
        String sentence = input.nextLine();
        String[] tokens = sentence.split(" ");

        System.out.println("The words that ending with the letters \"ED\" are :");
        for (String token : tokens) {
            if (token.substring(token.length()-2).equals("ED")){
                System.out.println(token);
            }
        }

    }
}
