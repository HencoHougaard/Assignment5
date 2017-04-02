package com.henco.assignment5;

import javax.swing.*;

/**
 * Created by Henco on 4/2/2017.
 */
public class Browser
{
    public void sendRequest()
    {
        String site = JOptionPane.showInputDialog("Enter site URL");
        String response = this.getISP().getResource(site);
        this.loadResponse(response);
    }

    private void loadResponse(String response)
    {
        System.out.println(response);
    }

    private ISP getISP()
    {
        return new NetworkSettings().getInternet();
    }
}
