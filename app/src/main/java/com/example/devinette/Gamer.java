package com.example.devinette;

public class Gamer {

    String id;
    String nomG;
    String scoreG;

    public Gamer(String id, String nomG, String scoreG) {
        this.id = id;
        this.nomG = nomG;
        this.scoreG = scoreG;
    }

    public Gamer() {

    }

    public String getId() {
        return id;
    }

    public void setId(String i) {
        this.id = i;
    }

    public String getNomG() {
        return nomG;
    }

    public void setNomG(String nomG) {
        this.nomG = nomG;
    }

    public String getScoreG() {
        return scoreG;
    }

    public void setScoreG(String scoreG) {
        this.scoreG = scoreG;
    }
}
