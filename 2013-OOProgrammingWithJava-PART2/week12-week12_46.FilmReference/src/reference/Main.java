package reference;

import reference.domain.Rating;


public class Main {

    public static void main(String[] args) {
        // Test your code here
        Rating given = Rating.GOOD;
        System.out.println("Rating " + given + ", value " + given.getValue());
        given = Rating.NEUTRAL;
        System.out.println("Rating " + given + ", value " + given.getValue());
        
    }
}
