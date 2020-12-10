package com.hvac;
import com.microsoft.signalr.HubConnectionState;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void setupController() {
        HVACController hvac = new HVACController(100.0f,0.0f,"https://test.com","/TestHub=","/api/Test/","token");
        hvac.SetupController();
        HubConnectionState res = hvac.getConnection().getConnectionState();
        assertEquals(HubConnectionState.DISCONNECTED, res);
    }

    @Test
    public void getMaxTemperature() {
        HVACController hvac = new HVACController(100.0f,0.0f,"testhost","testurl","testAPI","testtoken");
        assertEquals(100.0f, hvac.getMaxTemperature(),0.01f );
    }

    @Test
    public void getMinTemperature() {
        HVACController hvac = new HVACController(100.0f,0.0f,"testhost","testurl","testAPI","testtoken");
        assertEquals(0.0f, hvac.getMinTemperature(),0.01f );
    }

    @Test
    public void getHost() {
        HVACController hvac = new HVACController(100.0f,0.0f,"testhost","testurl","testAPI","testtoken");
        assertEquals("testhost",hvac.getHost() );
    }

    @Test
    public void getHubURL() {
        HVACController hvac = new HVACController(100.0f,0.0f,"testhost","testurl","testAPI","testtoken");
        assertEquals("testurl",hvac.getHubURL() );
    }

    @Test
    public void getApiURL() {
        HVACController hvac = new HVACController(100.0f,0.0f,"testhost","testurl","testAPI","testtoken");
        assertEquals("testAPI",hvac.getApiURL() );
    }

    @Test
    public void getToken() {
        HVACController hvac = new HVACController(100.0f,0.0f,"testhost","testurl","testAPI","testtoken");
        assertEquals("testtoken",hvac.getToken() );
    }
}
