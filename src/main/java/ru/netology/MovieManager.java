package ru.netology;

public class MovieManager {
    private String[] moviePosters = new String[0];

    private int maxLimit;

    public MovieManager() {
        this.maxLimit = 10;
    }

    public MovieManager(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    public void addNewMovie(String moviePoster) {
        String[] add = new String[moviePosters.length + 1];
        for (int i = 0; i < moviePosters.length; i++) {
            add[i] = moviePosters[i];
        }
        add[add.length - 1] = moviePoster;
        moviePosters = add;
    }

    public String[] findLast() {
        int resultLength;
        if (moviePosters.length < maxLimit) {
            resultLength = moviePosters.length;
        } else {
            resultLength = maxLimit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = moviePosters[moviePosters.length - 1 - i];
        }
        return result;
    }

    public String[] findAll() {
        return moviePosters;
    }
}



