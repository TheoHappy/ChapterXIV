import java.security.SecureRandom;

public class RandomSentences {
    public static void main(String[] args) {
        String article[] = {"the", "a", "one", "some", "any"};
        String noun[] = {"boy", "girl", "dog", "town", "car"};
        String verbs[] = {"drove", "jumped", "ran", "walked", "skipped"};
        String preposition[] = {"to", "from", "over", "under", "on"};

        SecureRandom randomNumber = new SecureRandom();
        for (int i = 0; i < 20; i++) {
            int articleIndex = randomNumber.nextInt(5);
            int nounIndex = randomNumber.nextInt(5);
            int verbIndex = randomNumber.nextInt(5);
            int prepositionIndex = randomNumber.nextInt(5);
            System.out.printf("%s %s %s %s %s %s\n",
                    article[articleIndex].substring(0,1).toUpperCase() + article[articleIndex].substring(1),
                    noun[nounIndex],
                    verbs[verbIndex],
                    preposition[prepositionIndex],
                    article[articleIndex],
                    noun[nounIndex].concat("."));
        }
    }
}
