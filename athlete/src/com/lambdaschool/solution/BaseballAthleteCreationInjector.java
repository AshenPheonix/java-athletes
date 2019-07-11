package com.lambdaschool.solution;

public class BaseballAthleteCreationInjector implements AthleteCreationInjector{
    private BaseballAthlete ath=new BaseballAthlete();

    @Override
    public Processor getProcess() {
        return ath;
    }
}
