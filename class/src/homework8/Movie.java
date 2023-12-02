package homework8;

public class Movie {
    String title;
    String studio;
    String rating;

    public Movie (String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie (String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    @Override
    public String toString() {
        return
                "Название фильма: " + title + "\n" +
                        "Студия: " + studio + "\n" +
                        "Рэйтинг: " + rating;
    }


}
