public class Movie {

    boolean adult;
    String originalLanguage;
    String originalTitle;
    String overview;
    double budget;
    Genre genre;

    public Movie(boolean adult, String originalLanguage, String originalTitle, String overview, double budget, Genre genre) {
        this.adult = adult;
        this.originalLanguage = originalLanguage;
        this.originalTitle = originalTitle;
        this.overview = overview;
        this.budget = budget;
        this.genre = genre;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public double getBudget() {
        return budget;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
