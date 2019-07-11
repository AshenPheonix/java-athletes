package com.lambdaschool.solution;

public class TrackAthleteProcessor implements Processor,CourtInjection{
    @Override
    public void displayAthlete() {
        System.out.printf("************%nTrack Runner%n************%n");
    }

    @Override
    public void displayCourt() {
        System.out.printf("************%nTrack Field%n************%n");
    }
}
