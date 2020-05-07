package keywordsexpressions;

public class MethodChallenge {
    public static void main(String[] args) {
        int position1 = calculateHighScorePosition(1500);
        displayHighScorePosition("player1", position1);
        int position2 = calculateHighScorePosition(900);
        displayHighScorePosition("player2", position2);
        int position3 = calculateHighScorePosition(400);
        displayHighScorePosition("player3", position3);
        int position4 = calculateHighScorePosition(50);
        displayHighScorePosition("player4", position4);
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
