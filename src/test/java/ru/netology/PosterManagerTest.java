package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    PosterItem item1 = new PosterItem(1, "Bloodshot", "action" );
    PosterItem item2 = new PosterItem(2, "Onward", "cartoon" );
    PosterItem item3 = new PosterItem(3, "Belgrad Hotel", "comedy" );
    PosterItem item4 = new PosterItem(4, "Gentlemen", "action" );
    PosterItem item5 = new PosterItem(5, "The Invisible Man", "horror" );
    PosterItem item6 = new PosterItem(6, "Trolls", "cartoon" );
    PosterItem item7 = new PosterItem(7, "Bloodshot", "action" );
    PosterItem item8 = new PosterItem(8, "Onward", "cartoon" );
    PosterItem item9 = new PosterItem(9, "Belgrad Hotel", "comedy" );
    PosterItem item10 = new PosterItem(10, "Gentlemen", "action" );
    PosterItem item11 = new PosterItem(11, "The Invisible Man", "horror" );
    PosterItem item12 = new PosterItem(12, "Trolls", "cartoon" );

    @Test
    public void shouldAddAndFindAll() {
        PosterManager poster = new PosterManager();
        poster.add(item1);
        poster.add(item2);
        poster.add(item3);
        poster.add(item4);
        poster.add(item5);
        poster.add(item6);

        PosterItem[] expected = { item1, item2, item3, item4, item5, item6 };
        PosterItem[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxLimit() {
        PosterManager poster = new PosterManager();
        poster.add(item1);
        poster.add(item2);
        poster.add(item3);
        poster.add(item4);
        poster.add(item5);
        poster.add(item6);
        poster.add(item7);
        poster.add(item8);
        poster.add(item9);
        poster.add(item10);
        poster.add(item11);
        poster.add(item12);

        PosterItem[] expected = { item12, item11, item10, item9, item8, item7, item6, item5, item4, item3 };
        PosterItem[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindUnderLimit() {
        PosterManager poster = new PosterManager();
        poster.add(item1);
        poster.add(item2);
        poster.add(item3);
        poster.add(item4);

        PosterItem[] expected = { item4, item3, item2, item1 };
        PosterItem[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldSetLimit() {
        PosterManager poster = new PosterManager(5);
        poster.add(item1);
        poster.add(item2);
        poster.add(item3);
        poster.add(item4);
        poster.add(item5);
        poster.add(item6);
        poster.add(item7);
        poster.add(item8);
        poster.add(item9);
        poster.add(item10);
        poster.add(item11);
        poster.add(item12);

        PosterItem[] expected = { item12, item11, item10, item9, item8 };
        PosterItem[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }


}
