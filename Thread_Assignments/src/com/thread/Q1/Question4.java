package com.thread.Q1;

class Multiplication {

	public void table(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}

	}

}

class Thread4 extends Thread {

	private Multiplication m;

	private int number;

	public Thread4(Multiplication m, int n) {
		this.number = n;
		this.m = m;
	}

	public void run() {
		synchronized (m) {
			m.table(number);

		}

	}

}

public class Question4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Multiplication t = new Multiplication();

		Thread4 t4 = new Thread4(t, 5);
		t4.start();

		Thread4 t5 = new Thread4(t, 100);
		t5.start();

	}

}
