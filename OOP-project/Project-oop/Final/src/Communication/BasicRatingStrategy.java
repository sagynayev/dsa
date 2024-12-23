package Communication;

import Interfaces.RatingStrategy;
import Users.Teacher;

public class BasicRatingStrategy implements RatingStrategy {
    @Override
    public void rate(Teacher teacher, double score) {
        System.out.println("Rated teacher " + teacher.getLastName() + " with score: " + score);
    }
}
