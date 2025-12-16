package org.example.model;

public class TennisNews extends News{

    private String competition;
    private String tennisPlayer;

    /*Constructor*/
    public TennisNews(String title, String text, String competition, String tennisPlayer) {
        super(title, text);
        this.competition = competition;
        this.tennisPlayer = tennisPlayer;
    }

    /*Getters and Setters*/
    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getTennisPlayer() {
        return tennisPlayer;
    }

    public void setTennisPlayer(String tennisPlayer) {
        this.tennisPlayer = tennisPlayer;
    }

    /*Abstract methods from News*/
    @Override
    public void calculateNewsPrice() {
        price = 150;

        price += (tennisPlayer.equalsIgnoreCase("Federer") || tennisPlayer.equalsIgnoreCase("Nadal") || tennisPlayer.equalsIgnoreCase("Djokovic")) ? 100 : 0;
    }

    @Override
    public void calculateScore() {
        score = 4;

        score += (tennisPlayer.equalsIgnoreCase("Federer") || tennisPlayer.equalsIgnoreCase("Nadal") || tennisPlayer.equalsIgnoreCase("Djokovic")) ? 3 : 0;
    }
}
