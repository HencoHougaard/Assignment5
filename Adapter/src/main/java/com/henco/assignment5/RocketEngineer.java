package com.henco.assignment5;

/**
 * Created by Henco on 4/2/2017.
 */
public class RocketEngineer implements Pilot
{
    private SpaceRocket rocket;

    public RocketEngineer()
    {
        rocket = new SpaceRocket();
    }


    public void launchSequence()
    {
        rocket.retractAccessArm();
        rocket.startAuxPower();
        rocket.lockAndClose();
        rocket.activateLaunchPad();
        rocket.startMain();
        rocket.takeOff();
    }
}
