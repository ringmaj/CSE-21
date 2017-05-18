import java.util.ArrayList;
import java.util.Scanner;

public class BBall {

	protected int quarter;
	protected int visitorScore;
	protected int homeScore;
	protected int overtimeNum;

	int counter = 1;

	ArrayList<Integer> visitorScores = new ArrayList<>();
	ArrayList<Integer> homeScores = new ArrayList<>();

	public BBall() {
		quarter = 0;
		visitorScore = 0;
		homeScore = 0;
		overtimeNum = quarter - 4;

	}

	public void setScores() {

		System.out.println("Please enter the scores below ");

		// if (overtime() == true) {
		//
		// for (int i = 0; i < 19; i++) {
		// if (i % 2 == 0) {
		// setHomeScores();
		// } else {
		// setVisitorScores();
		// }
		// }
		// }

		while (gameIsOver() == false) {

			for (int i = 0; i < 26; i++) {
				if (i % 2 == 0) {

					if (gameIsOver() == true)
						break;
					setHomeScores();

				} else {

					setVisitorScores();
				}

			}
		}

	}

	public String scoreList() {

		String result = "";

		System.out.println("Do you want to see BoxScore? (y or n):");
		Scanner input = new Scanner(System.in);

		boolean answer = true;

		String x = input.next();

		if (x == "y") {

			answer = true;
		}

		if (x == "Y") {
			answer = true;
		}

		if (x == "n") {
			answer = false;
		}

		if (x == "N") {
			answer = false;
		}

		if (answer == true) {

			// print quarters
			System.out.print("\t" + "\t1" + "\t2" + "\t3" + "\t4");

			for (int i = 0; i < (quarter - 4); i++) {
				System.out.print("\t" + (i + 1) + "OT");
			}

			System.out.println("");
			System.out.println("");

			System.out.print("Visitor:");

			for (int i = 0; i < visitorScores.size(); i++) {

				System.out.print("\t" + visitorScores.get(i));

			}

			System.out.println();
			System.out.print("   Home:");

			for (int i = 0; i < homeScores.size(); i++) {

				System.out.print("\t" + homeScores.get(i));

			}

			// String homeString = "Home scores: " + homeScore + "		" +
			// homeScores;
			// String visitorString = "Visitor scores: " + visitorScore + "		"
			// + visitorScores;
			// String overtime = "Number of Overtimes: " + overtimeNum;

			if (homeScore > visitorScore) {

				if ((quarter - 4) == 0) {

					result = ("The home team won " + homeScore + " to "
							+ visitorScore + " in Regulation");
				}

				else {
					result = ("The home team won " + homeScore + " to "
							+ visitorScore + " in " + (quarter - 4) + " Overtime");
				}

			}

			if (visitorScore > homeScore) {

				if ((quarter - 4) == 0) {

					result = ("The visitor team won " + visitorScore + " to "
							+ homeScore + " in Regulation");
				}

				else {
					result = ("The visitor team won " + visitorScore + " to "
							+ homeScore + " in " + (quarter - 4) + " Overtime");
				}

			}

		}

		if ((quarter - 4 == 9)) {
			result = ("Game ends in a tie with both teams scoring " + homeScore);
		}

		System.out.println("");
		System.out.println("");

		if ((quarter - 4) > 1) {
			result += "s";
		}
		return result;

	}

	public boolean overtime() {

		if (quarter > 4 && homeScore == visitorScore && gameIsOver() == false
				&& overtimeNum <= 9) {

			return true;
		} else {
			return false;
		}

	}

	public void setVisitorScores() {

		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		visitorScores.add(x);
		visitorScore += x;
		quarter++;

		// System.out.println("Quarter: " + quarter);
		// System.out.println("Home score: " + homeScore);
		// System.out.println("Visitor score: " + visitorScore);
		// System.out.println("Overtime " + overtime());
		// System.out.println("Game is over " + gameIsOver());
		// System.out.println(overtimeNum);
	}

	public void setHomeScores() {

		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		homeScores.add(x);
		homeScore += x;
		// System.out.println("Game is over " + gameIsOver());

		// if (gameIsOver() == false && overtime() == true) {
		//
		// for (int i = 0; i < 19; i++) {
		// if (i % 2 == 0) {
		// setHomeScores();
		// } else {
		// setVisitorScores();
		// }
		// }

	}

	public boolean gameIsOver() {
		if (quarter >= 4 && homeScore != visitorScore || (quarter - 4 == 9))
			return true;
		else {
			return false;
		}
	}

	public int getVisitorScore() {
		return visitorScore;
	}

}
