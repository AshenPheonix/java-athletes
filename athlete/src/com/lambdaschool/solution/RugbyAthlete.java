package com.lambdaschool.solution;

public class RugbyAthlete implements Processor,CourtInjection{
    @Override
    public void displayAthlete() {
        System.out.printf("************%nRugby Athlete%n************%n");
    }

    @Override
    public void displayCourt() {
        System.out.printf("************%nRugby Pitch%n************%n");
    }
}
