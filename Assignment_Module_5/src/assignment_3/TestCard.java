package assignment_3;

public class TestCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TravelCard t = new TravelCard(123, 200000, 30000);

		if (t.swipeCard(100)) {

			System.out.println(t.toString());

			System.out.println("Reward Points : " + t.getRewardPoints());

		} else {
			System.out.println("Enter valid amount");
		}

	}

}
