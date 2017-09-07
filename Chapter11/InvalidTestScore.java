package Chapter11;

/**
 * Created by Chris on 1/28/2017.
 */
public class InvalidTestScore extends Exception {

    public InvalidTestScore() {

        super("Error: Invalid Test Score");
    }

    public InvalidTestScore(int score) {

        super("Error: Invalid Test Score: " + score);
    }
}
