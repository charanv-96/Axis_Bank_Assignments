package assignment_3;

public abstract class PrepaidCard {

	private int CardNo;
	private double availableBalance;
	private double swipeLimit;

	public abstract boolean swipeCard(double amount);

	@Override
	public String toString() {

		return "Card no : " + this.CardNo + "\n" 
		+ "Available Balance : " + this.availableBalance;

	}

	public int getCardNo() {
		return CardNo;
	}

	public void setCardNo(int cardNo) {
		CardNo = cardNo;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public double getSwipeLimit() {
		return swipeLimit;
	}

	public void setSwipeLimit(double swipeLimit) {
		this.swipeLimit = swipeLimit;
	}

	public final void rechargeCard(double amount) {

		this.availableBalance += amount;

	}

	PrepaidCard(int cardNo, double availableBalance, double swipeLimit) {

		this.CardNo = cardNo;
		this.availableBalance = availableBalance;
		this.swipeLimit = swipeLimit;

	}

}

interface Rewardable {

	double calculateRewardPoints(double amount);

}

class TravelCard extends PrepaidCard implements Rewardable {

	TravelCard(int cardNo, double availableBalance, double swipeLimit) {
		super(cardNo, availableBalance, swipeLimit);
		// TODO Auto-generated constructor stub
	}

	private int rewardPoints;

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	@Override
	public double calculateRewardPoints(double amount) {
		// TODO Auto-generated method stub

		double rupeeAmount = amount * 60;

		return (rupeeAmount * 5) / 100;
	}

	@Override
	public boolean swipeCard(double amount) {
		// TODO Auto-generated method stub

		if (amount*60 > getSwipeLimit() || amount*60 > getAvailableBalance()) {
			return false;
		} else {
			double av_bal = getAvailableBalance();
			setAvailableBalance(av_bal - (amount * 60) - (amount * 0.05));
			calculateRewardPoints(amount);
			return true;
		}

	}

}