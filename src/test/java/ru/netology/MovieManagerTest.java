package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void ShouldFindReversed() {
        MovieManager movieManager = new MovieManager();

        movieManager.addNewMovie("1");
        movieManager.addNewMovie("2");
        movieManager.addNewMovie("3");
        movieManager.addNewMovie("4");
        movieManager.addNewMovie("5");
        movieManager.addNewMovie("6");
        movieManager.addNewMovie("7");

        movieManager.findLast();
        String[] expected = {"7", "6", "5", "4", "3", "2", "1"};
        String[] actual = movieManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindReversedLessThanTheLimit() {
        MovieManager movieManager = new MovieManager(10);

        movieManager.addNewMovie("1");
        movieManager.addNewMovie("2");
        movieManager.addNewMovie("3");
        movieManager.addNewMovie("4");
        movieManager.addNewMovie("5");

        String[] expected = {"5", "4", "3", "2", "1"};
        String[] actual = movieManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindReversedOverTheLimit() {
        MovieManager movieManager = new MovieManager(10);

        movieManager.addNewMovie("1");
        movieManager.addNewMovie("2");
        movieManager.addNewMovie("3");
        movieManager.addNewMovie("4");
        movieManager.addNewMovie("5");
        movieManager.addNewMovie("6");
        movieManager.addNewMovie("7");
        movieManager.addNewMovie("8");
        movieManager.addNewMovie("9");
        movieManager.addNewMovie("10");
        movieManager.addNewMovie("11");

        String[] expected = {"11", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        String[] actual = movieManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindReversedAtTheLimit() {
        MovieManager movieManager = new MovieManager(10);

        movieManager.addNewMovie("1");
        movieManager.addNewMovie("2");
        movieManager.addNewMovie("3");
        movieManager.addNewMovie("4");
        movieManager.addNewMovie("5");
        movieManager.addNewMovie("6");
        movieManager.addNewMovie("7");
        movieManager.addNewMovie("8");
        movieManager.addNewMovie("9");
        movieManager.addNewMovie("10");

        String[] expected = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
        String[] actual = movieManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovies() {
        MovieManager movieManager = new MovieManager();

        movieManager.addNewMovie("1");
        movieManager.addNewMovie("2");
        movieManager.addNewMovie("3");
        movieManager.addNewMovie("4");
        movieManager.addNewMovie("5");
        movieManager.addNewMovie("6");
        movieManager.addNewMovie("7");

        String[] expected = {"1", "2", "3", "4", "5", "6", "7"};
        String[] actual = movieManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
