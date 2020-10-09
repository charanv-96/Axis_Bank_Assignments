package com.thread.Q1;

class Thread1 extends Thread {

	public void run() {

		System.out.println("Hi! I am a thread");

	}

}

class Thread2 extends Thread {

	public void run() {

		System.out.println("Me too");

	}

}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 t1 = new Thread1();
		t1.run();

		Thread2 t2 = new Thread2();
		t2.run();

	}

}
