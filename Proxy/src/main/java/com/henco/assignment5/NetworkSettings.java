package com.henco.assignment5;

/**
 * Created by Henco on 4/2/2017.
 */
public class NetworkSettings
{
    public ISP getInternet()
    {
        return new InternetProxy();
    }

    public ISP getISP()
    {
        return new Telkom();
    }
}
