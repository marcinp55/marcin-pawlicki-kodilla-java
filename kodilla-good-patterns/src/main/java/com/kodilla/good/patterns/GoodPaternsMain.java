package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GoodPaternsMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String movieList = movieStore.getMovies().entrySet().stream()
                .flatMap(set -> set.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movieList);
    }
}
