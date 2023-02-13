package ru.netology;

public class PosterItem {

    private int movieId;
    private String movieName;
    private String movieGenre;

    public PosterItem(int movieId, String movieName, String movieGenre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setProductName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setProductGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

}
