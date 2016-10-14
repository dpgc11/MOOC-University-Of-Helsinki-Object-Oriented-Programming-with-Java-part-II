
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yogesh
 */
public class Result {

    private int length;
    private List scores;
    private Random rand;
    Skier skier;

    public Result() {
        this.length = 0;
        this.scores = new ArrayList<Integer>();
    }

    public List judgesScores() {
        rand = new Random();
        int low = 10;
        int high = 21;
        for (int i = 0; i < 5; i++) {
            int randomInt = rand.nextInt((high - low)) + low;
            this.scores.add(randomInt);
        }
        return this.scores;
    }

    public int validJudgesScores() {
        int sum = 0;
        for (int i : this.scores) {
           sum += this.scores.get(i);

        }
        int res = maxScore() + minScore();
        sum -= res;
        return sum;

    }

    public int maxScore() {
        int max = 0;
        for (int i : this.scores) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }

    public int minScore() {
        int min = this.scores[0];
        for (int i : this.scores) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }

    public int finalScore() {
        int finalScore = this.length + validJudgesScores();
        skier.setPoints(finalScore);
        return finalScore;
    }
}
