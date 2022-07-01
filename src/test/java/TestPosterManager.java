import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPosterManager {


    @Test
    public void shouldAddPosters() {
        PosterManager manager = new PosterManager();
        manager.add("one");
        manager.add("two");
        manager.add("three");
        manager.add("four");
        manager.add("five");
        manager.add("six");
        manager.add("seven");
        manager.add("eight");
        manager.add("nine");
        manager.add("ten");
        manager.add("zero");

        String[] expected = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "zero"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldShowEmptyPosters() {
        PosterManager manager = new PosterManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldFindLastTen() {
        PosterManager manager = new PosterManager();
        manager.add("zero");
        manager.add("one");
        manager.add("two");
        manager.add("three");
        manager.add("four");
        manager.add("five");
        manager.add("six");
        manager.add("seven");
        manager.add("eight");
        manager.add("nine");
        manager.add("ten");

        String[] expected = {"ten", "nine", "eight", "seven", "six", "five", "four", "three", "two", "one"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastThree() {
        PosterManager manager = new PosterManager(3);
        manager.add("zero");
        manager.add("one");
        manager.add("two");
        manager.add("three");
        manager.add("four");
        manager.add("five");
        manager.add("six");
        manager.add("seven");
        manager.add("eight");
        manager.add("nine");
        manager.add("ten");

        String[] expected = {"ten", "nine", "eight"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfNotTen() {
        PosterManager manager = new PosterManager();
        manager.add("zero");
        manager.add("one");
        manager.add("two");


        String[] expected = {"two", "one", "zero"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}

