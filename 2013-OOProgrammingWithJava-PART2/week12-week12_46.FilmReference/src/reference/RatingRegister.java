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
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Yogesh
 */
public class RatingRegister {

    private Map<Film, List<Rating>> register;
    private Map<Person, Map<Film, Rating>> personalRating;

    public RatingRegister() {
        this.register = new HashMap<Film, List<Rating>>();
        this.personalRating = new HashMap<Person, Map<Film, Rating>>();
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

    public void addRating(Person person, Film film, Rating rating) {
        if (!this.personalRating.containsKey(person)) {
            this.personalRating.put(person, new HashMap<Film, Rating>());
            if (!this.personalRating.get(person).containsKey(film)) {
                this.personalRating.get(person).put(film, rating);
                addRating(film, rating);
            }
        } else {
            if (!this.personalRating.get(person).containsKey(film)) {
                this.personalRating.get(person).put(film, rating);
                addRating(film, rating);
            }
        }
    }

    public Rating getRating(Person person, Film film) {
        Rating r;

        if (this.personalRating.containsKey(person)) {
            if (this.personalRating.get(person).containsKey(film)) {
                r = this.personalRating.get(person).get(film);
                return r;
            }
        }
        r = Rating.NOT_WATCHED;
        return r;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        Map<Film, Rating> pRatings = new HashMap<Film, Rating>();
        if (this.personalRating.containsKey(person)) {
            pRatings = this.personalRating.get(person);
        }

        return pRatings;
    }

    public List<Person> reviewers() {
        List<Person> reviewersOfFilms = new ArrayList<Person>();

        for (Person p : this.personalRating.keySet()) {
            if (!this.personalRating.get(p).isEmpty()) {
                reviewersOfFilms.add(p);
            }
        }

        return reviewersOfFilms;
    }
}
