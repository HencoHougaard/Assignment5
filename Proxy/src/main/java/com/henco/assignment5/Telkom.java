package com.henco.assignment5;

/**
 * Created by Henco on 4/2/2017.
 */
public class Telkom implements ISP
{

    public String getResource(String site)
    {
        if(site == "www.google.co.za")
        {
            return "Google";
        }
        else if(site == "www.takealot.co.za")
        {
            return "Takealot";
        }
        else if(site == "www.youtube.com")
        {
            return "YouTube";
        }
        else
            return null;
    }
}
