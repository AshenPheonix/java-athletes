package com.lambdaschool.solution;

public class TrackAthleteCreationInjector implements AthleteCreationInjector{
    private TrackAthleteProcessor ath=new TrackAthleteProcessor();

    @Override
    public Processor getProcess() {
        return ath;
    }
}
