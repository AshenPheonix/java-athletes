package com.lambdaschool.solution;

public class BaseballAthlete implements Processor,CourtInjection {
    @Override
    public void displayAthlete() {
        System.out.printf("************%nBaseball Athlete%n************%n");
    }

    @Override
    public void displayCourt() {
        System.out.printf("************%nBaseball Diamond%n************%n");
    }
}
