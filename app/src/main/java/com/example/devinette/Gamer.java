package com.example.devinette;

public class Gamer {

    String i;
    String nomG;
    String scoreG;

    public Gamer(String i, String nomG, String scoreG) {
        this.i = i;
        this.nomG = nomG;
        this.scoreG = scoreG;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
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
