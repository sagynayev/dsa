package Communication;

import Interfaces.RatingStrategy;
import Users.Teacher;

public class AdvancedRatingStrategy implements RatingStrategy {
    @Override
    public void rate(Teacher teacher, double score) {
        System.out.println("Advanced analysis: Rated teacher " + teacher.getLastName() + " with score: " + score);
    }
}