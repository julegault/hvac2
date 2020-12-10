package com.hvac;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        //Sensor Token
        String token = "lTVyDQHg3c";

        //Temperature Thresholds to trigger HVAC control
        float maxTemperature = 70.0f;
        float minTemperature = 40.0f;

        //URLS
        String host= "https://hvac-simulator.herokuapp.com";
        String HubURL ="/SensorHub?token=";
        String ApiURL ="/api/Hvac/";

        //Create and start HVAC
        HVACController hvac = new HVACController(maxTemperature,minTemperature,host,HubURL,ApiURL,token);
        hvac.SetupController();
        hvac.StartController();
    }
}
