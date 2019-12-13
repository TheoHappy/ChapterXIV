import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence and press enter ");
        String sentence = input.nextLine();
        System.out.println(printLatinWord(sentence));
    }
    public static String printLatinWord(String sentence){
        String result = "";
        String[] tokens = sentence.split(" ");
        for (String token : tokens) {
            result += token.substring(1) + token.substring(0, 1) + "ay"+ " ";
        }
        return result;
    }
}
