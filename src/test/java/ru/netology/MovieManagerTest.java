package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void ShouldFindReversed() {
        MovieManager movieManager = new MovieManager();

        movieManager.addNewMovie("Бладшот");
        movieManager.addNewMovie("Вперёд");
        movieManager.addNewMovie("Отель Белград");
        movieManager.addNewMovie("Джентльмены");
        movieManager.addNewMovie("Человек-невидимка");
        movieManager.addNewMovie("Тролли. Мировой тур");
        movieManager.addNewMovie("Номер Один");

        movieManager.findLast();
        String[] expected = {"Номер Один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = movieManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindReversedWithinLimit() {
        MovieManager movieManager = new MovieManager(8);

        movieManager.addNewMovie("Бладшот");
        movieManager.addNewMovie("Вперёд");
        movieManager.addNewMovie("Отель Белград");
        movieManager.addNewMovie("Джентльмены");
        movieManager.addNewMovie("Человек-невидимка");
        movieManager.addNewMovie("Тролли. Мировой тур");
        movieManager.addNewMovie("Номер Один");

        String[] expected = {"Номер Один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = movieManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindReversedOverTheLimit() {
        MovieManager movieManager = new MovieManager(11);

        movieManager.addNewMovie("Бладшот");
        movieManager.addNewMovie("Вперёд");
        movieManager.addNewMovie("Отель Белград");
        movieManager.addNewMovie("Джентльмены");
        movieManager.addNewMovie("Человек-невидимка");
        movieManager.addNewMovie("Тролли. Мировой тур");
        movieManager.addNewMovie("Номер Один");
        movieManager.addNewMovie("8");
        movieManager.addNewMovie("9");
        movieManager.addNewMovie("10");
        movieManager.addNewMovie("11");

        String[] expected = {"11", "10", "9", "8", "Номер Один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = movieManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindReversedAtTheLimit() {
        MovieManager movieManager = new MovieManager(7);

        movieManager.addNewMovie("Бладшот");
        movieManager.addNewMovie("Вперёд");
        movieManager.addNewMovie("Отель Белград");
        movieManager.addNewMovie("Джентльмены");
        movieManager.addNewMovie("Человек-невидимка");
        movieManager.addNewMovie("Тролли. Мировой тур");
        movieManager.addNewMovie("Номер Один");

        String[] expected = {"Номер Один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = movieManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovies() {
        MovieManager movieManager = new MovieManager();

        movieManager.addNewMovie("Бладшот");
        movieManager.addNewMovie("Вперёд");
        movieManager.addNewMovie("Отель Белград");
        movieManager.addNewMovie("Джентльмены");
        movieManager.addNewMovie("Человек-невидимка");
        movieManager.addNewMovie("Тролли. Мировой тур");
        movieManager.addNewMovie("Номер Один");

        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентльмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер Один"};
        String[] actual = movieManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
