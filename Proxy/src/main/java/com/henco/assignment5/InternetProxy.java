package com.henco.assignment5;

import java.util.Calendar;

/**
 * Created by Henco on 4/2/2017.
 */
public class InternetProxy implements ISP
{

    public String getResource(String site)
    {
        this.logRequest(site);
        if(this.isBlocked(site))
        {
            return "This site has been blocked";
        }
        NetworkSettings networkSetting = new NetworkSettings();
        return networkSetting.getISP().getResource(site);
    }

    private void logRequest(String site)
    {
        System.out.println("Request for: " + site);
    }

    private boolean isBlocked(String site)
    {
        if(site == "www.takealot.co.za")
        {
            return false;
        }
        else if(site == "www.youtube.com")
        {
            return false;
        }
        else
            return true;
    }


}
