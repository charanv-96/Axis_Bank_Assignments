package com.manipal.dp.structural.proxy;

public class RealInternet implements Internet {

	@Override
	public void connectTo(String serverHost) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Connecting to " + serverHost);
		
	}
	
	

}
