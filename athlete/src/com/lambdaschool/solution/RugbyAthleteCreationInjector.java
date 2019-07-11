package com.lambdaschool.solution;

public class RugbyAthleteCreationInjector implements AthleteCreationInjector{
    private RugbyAthlete ath=new RugbyAthlete();

    @Override
    public Processor getProcess() {
        return ath;
    }
}
