package com.example.project;

import java.util.Random;

public class Day4 {

    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer {
        private String name;
        private int speed;
        private int distanceTraveled = 0;
        private int runDuration;
        private int restDuration;
        private boolean currentlyRunning = true;
        private int timeLeftRunning;
        private int timeLeftResting;

        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            this.timeLeftRunning = runDuration;
            this.timeLeftResting = 0;
        }

        public int getDistanceTraveled() {
            return distanceTraveled;
        }

        public String getName() {
            return name;
        }

        public void simulateSecond() {
            if (currentlyRunning) {
                distanceTraveled += speed;
                timeLeftRunning--;
                if (timeLeftRunning == 0) {
                    currentlyRunning = false;
                    timeLeftResting = restDuration;
                }
            } else {
                timeLeftResting--;
                if (timeLeftResting == 0) {
                    currentlyRunning = true;
                    timeLeftRunning = runDuration;
                }
            }
        }
    }

    public static String simulateRace(int time, Reindeer[] reindeers) {
        for (int seconds = 0; seconds < time; seconds++) {
            for (Reindeer reindeer : reindeers) {
                reindeer.simulateSecond();
            }
        }

        Reindeer winner = reindeers[0];
        for (Reindeer reindeer : reindeers) {
            if (reindeer.getDistanceTraveled() > winner.getDistanceTraveled()) {
                winner = reindeer;
            }
        }

        return winner.getName();
    }

    public static void main(String[] args) {
        }
}
