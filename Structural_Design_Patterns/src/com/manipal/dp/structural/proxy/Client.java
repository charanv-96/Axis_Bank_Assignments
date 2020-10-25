package com.manipal.dp.structural.proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Internet internet = new ProxyInternet();
		
		try
		{
			internet.connectTo("gmail.com");
			internet.connectTo("abc.com");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
