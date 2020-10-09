package com.thread.Q1;

class Multiplication {

	public void table(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}

	}

}

class Thread4 extends Thread {

	Multiplication t = new Multiplication();

	private int number;

	public Thread4(int n) {
		this.number = n;
	}

	public void run() {
		synchronized (t) {
			t.table(number);

		}

	}

}

public class Question4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread4 t4 = new Thread4(5);
		t4.start();
		Thread.sleep(1000);

		Thread4 t5 = new Thread4(100);
		t5.start();

	}

}
