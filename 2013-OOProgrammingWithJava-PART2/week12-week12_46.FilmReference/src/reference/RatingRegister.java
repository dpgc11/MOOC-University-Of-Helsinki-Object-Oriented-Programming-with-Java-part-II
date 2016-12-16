/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Yogesh
 */
public class RatingRegister {

    private Map<Film, List<Rating>> register;

    public RatingRegister() {
        this.register = new HashMap<Film, List<Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!this.register.containsKey(film)) {
            this.register.put(film, new ArrayList<Rating>());
            this.register.get(film).add(rating);
        } else {
            this.register.get(film).add(rating);
        }
    }

    public List<Rating> getRatings(Film film) {
        List<Rating> filmRatings = new ArrayList<Rating>();

        for (Film f : register.keySet()) {
            if (f == film) {
                filmRatings = register.get(f);
            }
        }

        return filmRatings;
    }

    public Map<Film, List<Rating>> filmRatings() {
        return this.register;
    }

}
