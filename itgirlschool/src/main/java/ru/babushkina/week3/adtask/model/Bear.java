package ru.babushkina.week3.adtask.model;

public class Bear {
    private int health = 100;
    private int energy = 100;
    private final double FANGSCOEFF = 1.5;

    public void setHealth(int health) {
        this.health = health;
    }
    
    public int getHealth() {
        return this.health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    
    public int getEnergy() {
        return this.energy;
    }

    public double getFANGCOEFF() {
        return this.FANGSCOEFF;
    }
}
