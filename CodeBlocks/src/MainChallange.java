public class MainChallange {
    public static void main(String[] args) {
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        int newFinalScore = newScore;
//
//        if(newGameOver) {
//            newFinalScore += (newFinalScore * newBonus);
//            System.out.println("Your final score was " + newFinalScore);
//        }
//

        calculateScore(true, 800, 4, 800);






    }

    public static void  calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {


        int finalScore = score;

        if(gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }





}
