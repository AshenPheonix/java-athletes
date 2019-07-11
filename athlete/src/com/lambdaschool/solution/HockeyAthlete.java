package com.lambdaschool.solution;

public class HockeyAthlete implements Processor,CourtInjection {
    @Override
    public void displayAthlete() {
        System.out.printf("************%nHockey Goalie%n************%n");
    }

    @Override
    public void displayCourt() {
        System.out.printf("************%nHockey Rink%n************%n");
    }
}
