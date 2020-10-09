package com.thread.Q1;

class Thread3 extends Thread {

	private String word;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Thread3(String s) {
		this.word = s;
	}

	public void run() {

		System.out.print(word);

	}

}

class Brackets {

	public static void openBracket() {
		System.out.print("[");
	}

	public static void closeBracket() {
		System.out.print("]");
	}

}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Brackets b = new Brackets();

		b.openBracket();

		Thread3 t1 = new Thread3("in between the bracket");
		t1.run();

		b.closeBracket();

	}

}
