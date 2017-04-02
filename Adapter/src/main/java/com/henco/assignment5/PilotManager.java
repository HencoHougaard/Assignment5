package com.henco.assignment5;

/**
 * Created by Henco on 4/2/2017.
 */
public class PilotManager implements Pilot
{
    private Pilot pilot;

    public PilotManager()
    {
        pilot = new RocketEngineer();
    }
    public void launchSequence()
    {
        pilot.launchSequence();
    }
}
