package Chapter11;

import java.util.Scanner;

public class Chapter11 {

    public static void main(String [] args) throws InvalidTestScore {

        Scanner keyboard = new Scanner(System.in);
        int[] scores;
        int tests;

        //request amount of tests to grade. Use amount for score array

        System.out.println("How many test would you like to record?");
        tests = Integer.parseInt(keyboard.nextLine());

        scores = new int[tests];

        //loop through to enter scores

        for(int i = 0; i < tests; i++) {

            System.out.println("Enter a test score: ");
            scores[i] = Integer.parseInt(keyboard.nextLine());
        }


        TestScores testScores = new TestScores(scores);

        System.out.println("The average of the scores is :" + testScores.getAverage());


    }
}
