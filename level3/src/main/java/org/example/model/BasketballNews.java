package org.example.model;

public class BasketballNews extends News{

    private String competition;
    private String club;

    /*Constructor*/
    public BasketballNews(String title, String text, String competition, String club) {
        super(title, text);
        this.competition = competition;
        this.club = club;
    }

    /*Getters and Setters*/
    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    /*Abstract methods from News*/
    @Override
    public void calculateNewsPrice() {
        price = 250;

        price += (competition.equalsIgnoreCase("Eurolliga")) ? 75 : 0;
        price += (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) ? 75 : 0;
    }

    @Override
    public void calculateScore() {
        score = 4;

        score += (competition.equalsIgnoreCase("Eurolliga")) ? 3 : (competition.equalsIgnoreCase("ACB") ? 2 : 0);
        score += (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) ? 1 : 0;
    }
}
