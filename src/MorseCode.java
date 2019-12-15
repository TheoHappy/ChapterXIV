import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence and press enter ");
        String sentence = input.nextLine();
        String[] tokens = sentence.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            for (int j = 0; j < tokens[i].length(); j++){
                System.out.println(tokens[i].charAt(j));
            }
        }
    }
    public static String convertToMorseCode(char c){
        String result = null;
        switch (c){
            case 'a':
                result = ".-";
                break;
            case  'b':
                result = "-...";
                break;
            case 'c':
                result = "-.-.";
                break;
            case '':
                result = "";
                break;

        }
    }
}
