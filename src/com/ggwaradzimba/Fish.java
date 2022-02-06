package com.ggwaradzimba;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {
        System.out.println("Fish is resting");
    }

    private void moveMusccles() {
        System.out.println("Fishing moving muscles");

    }

    private void moveBackfin() {
        System.out.println("Fish moving backfin");

    }

    private void swim(int speed) {
        moveMusccles();;
        moveBackfin();
        super.move(speed);
    }

    @Override
    public void move(int speed) {
        swim(speed);
    }
}
