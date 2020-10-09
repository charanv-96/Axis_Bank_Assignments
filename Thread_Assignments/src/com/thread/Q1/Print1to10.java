package com.thread.Q1;

public class Print1to10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			Thread.sleep(5000);
			
		}

	}

}
