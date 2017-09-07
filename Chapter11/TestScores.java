package Chapter11;

import java.util.Arrays;

/**
 * Created by Chris on 1/28/2017.
 */
public class TestScores {

    private int[] scores;


    public TestScores(int[] test) throws InvalidTestScore {

        this.scores = new int[test.length];

        for(int i = 0; i < test.length; i++) {
            if(test[i] < 0 || test[i] > 100) {
                throw new InvalidTestScore();
            } else {
                this.scores[i] = test[i];
            }

        }
        System.out.println(Arrays.toString(test));
    }

    public double getAverage() {

        double allTests = 0.0;

        for(int i = 0; i < this.scores.length; i++) {

            allTests += this.scores[i];

        }

        return  allTests / this.scores.length;
    }
}
