package org.example.model;

public class F1News extends News{

    private String racingTeam;

    /*Constructor*/
    public F1News(String title, String text, String racingTeam) {
        super(title, text);
        this.racingTeam = racingTeam;
    }

    /*Getters and Setters*/
    public String getRacingTeam() {
        return racingTeam;
    }

    public void setRacingTeam(String racingTeam) {
        this.racingTeam = racingTeam;
    }

    /*Abstract methods from News*/
    @Override
    public void calculateNewsPrice() {
        price = 100;

        price += (racingTeam.equalsIgnoreCase("Ferrari") || racingTeam.equalsIgnoreCase("Mercedes")) ? 50 : 0;
    }

    @Override
    public void calculateScore() {
        price = 4;

        price += (racingTeam.equalsIgnoreCase("Ferrari") || racingTeam.equalsIgnoreCase("Mercedes")) ? 2 : 0;
    }
}
