package com.aicube.JavaTestProject;

/**
 * Hello world! v2.0
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Device device = new Device("device3","Arduino nano");
        System.out.println("device name: "+device.getDeviceName() + " Type: " + device.getDeviceType() );
        
    }
}
