import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner inputDigit = new Scanner(System.in);
        char[] englishDictionary = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'
        };

        String[] morseDictionary = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----"};

        System.out.println();
        System.out.println("This is an English to Morse Code Translator and Vice Versa.");
        System.out.println("Please Enter 1 for English to Morse Code\n " +
                            "         or 2 for Morse Code to English");

        int choice = inputDigit.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Please enter what you would like translate into Morse Code.");
                String sentence = input.nextLine();
                sentence = sentence.toLowerCase();
                String[] word = sentence.split(" ");

                String englishToMorse = "";
                for (int i = 0; i < word.length; i++) {
                    for (int j = 0; j < word[i].length(); j++) {
                        for (int k = 0; k < englishDictionary.length; k++) {
                            if (englishDictionary[k] == word[i].charAt(j)) {
                                englishToMorse += morseDictionary[k] + " ";
                            }
                        }
                    }
                    englishToMorse += "  ";
                }
                System.out.println(englishToMorse);
                break;
            case 2:
                System.out.println("Please enter what you would like translate into English.");
                String morseInput = input.nextLine();
                String[] token3Blanks = morseInput.split("   ");

                String morseToEnglish = "";
                String[] token1Blank = null;
                for (int i = 0; i < token3Blanks.length; i++) {
                    token1Blank = token3Blanks[i].split(" ");
                    for (int j = 0; j < token1Blank.length; j++) {
                        for (int k = 0; k < morseDictionary.length; k++) {
                            if (morseDictionary[k].equals(token1Blank[j])) {
                                morseToEnglish = morseToEnglish + englishDictionary[k];
                            }
                        }
                    }
                    morseToEnglish += " ";
                }
                System.out.println(morseToEnglish);
                break;
            default:
                System.err.println("Invalid Option Entered");
                break;
        }
    }
}
