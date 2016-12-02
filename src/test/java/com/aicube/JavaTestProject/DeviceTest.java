package com.aicube.JavaTestProject;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class DeviceTest 

    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DeviceTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DeviceTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testDeviceName()
    {
    	Device device = new Device();
    
        assertEquals("device1", device.getDeviceName());
        assertEquals("arduino uno", device.getDeviceType());
    }
    
    
    
    public void testDeviceName2()
    {
    	Device device = new Device("device2","arduino due");
    
        assertEquals("device2", device.getDeviceName());
        assertEquals("arduino due", device.getDeviceType());
    }
    
    
    
}