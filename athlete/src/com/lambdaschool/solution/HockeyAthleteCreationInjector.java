package com.lambdaschool.solution;

public class HockeyAthleteCreationInjector implements AthleteCreationInjector{
    private HockeyAthlete ath=new HockeyAthlete();

    @Override
    public Processor getProcess() {
        return ath;
    }
}
