import java.util.Scanner;

public class BBallTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		BBall game = new BBall();

		game.setScores();
		System.out.println(game.scoreList());

	}

}
