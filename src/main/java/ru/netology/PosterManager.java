package ru.netology;

public class PosterManager {

    private PosterItem[] items = new PosterItem[0];

    private int limit;

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {
        this.limit = 10;
    }

    public void add(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public PosterItem[] findAll() {
        return items;
    }

    public PosterItem[] findLast() {
        int resultLength;

        if (items.length < limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }

        PosterItem[] result = new PosterItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;
    }


}
