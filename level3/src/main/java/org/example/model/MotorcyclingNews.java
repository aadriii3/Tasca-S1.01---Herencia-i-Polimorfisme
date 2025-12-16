package org.example.model;

public class MotorcyclingNews extends News{

    private String team;

    /*Constructor*/
    public MotorcyclingNews(String title, String text, String team) {
        super(title, text);
        this.team = team;
    }

    /*Getter and Setter*/
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    /*Absract voids from News*/
    @Override
    public void calculateNewsPrice() {
        price = 100;

        price += (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")) ? 50 : 0;

    }

    @Override
    public void calculateScore() {
        price = 3;

        price += (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")) ? 3 : 0;
    }
}
