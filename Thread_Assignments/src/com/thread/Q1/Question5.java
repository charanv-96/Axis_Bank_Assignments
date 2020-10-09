package com.thread.Q1;

class Account {

	private int acctno;
	private String name;
	private double balance;

	public int getAcctno() {
		return acctno;
	}

	public void setAcctno(int acctno) {
		this.acctno = acctno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(int acctno, String name, double balance) {

		this.acctno = acctno;
		this.name = name;
		this.balance = balance;

	}

	public void withdraw(double amount) {

		this.balance -= amount;
		System.out.println("New balance : " + this.balance);

	}

}

class Thread6 extends Thread {

	private Account account;
	private double amount;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Thread6(Account account, double amount) {

		this.account = account;
		this.amount = amount;

	}

	public void run() {
		synchronized (account) {

			account.withdraw(amount);

		}

	}

}

class AccountDriver {

	public static void main(String[] args) {

		Account account = new Account(100, "Charan", 20000);

		Thread6 t1 = new Thread6(account, 2000);
		t1.run();

		Thread6 t2 = new Thread6(account, 5000);
		t2.run();

	}
}
