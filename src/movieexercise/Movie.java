package movieexercise;

import java.util.Objects;

public class Movie {
    private String title;
    private String director;
    private int duration;
    private int releaseYear;

    public Movie(String title, String director, int duration, int releaseYear) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", duration=" + duration +
                ", releaseYear=" + releaseYear +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, director, releaseYear);
    }
}
