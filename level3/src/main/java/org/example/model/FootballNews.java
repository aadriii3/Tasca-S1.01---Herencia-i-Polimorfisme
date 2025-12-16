package org.example.model;

public class FootballNews extends News{

    private String competition;
    private String club;
    private String player;

    /*Constructor with new fields*/
    public FootballNews(String title, String text, String competition, String club, String player) {
        super(title, text);
        this.competition = competition;
        this.club = club;
        this.player = player;
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

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    /*Abstract methods from News*/
    @Override
    public void calculateNewsPrice() {
        price = 300;

        price += (competition.equalsIgnoreCase("Lliga de Campions")) ? 100 : 0;
        price += (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) ? 100 : 0;
        price += (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) ? 50 : 0;
    }

    @Override
    public void calculateScore() {
        score = 5;

        score += (competition.equalsIgnoreCase("Lliga de Campions")) ? 3 : (competition.equalsIgnoreCase("Lliga") ? 2 : 0);
        score += (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) ? 1 : 0;
        score += (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) ? 1 : 0;
    }
}
