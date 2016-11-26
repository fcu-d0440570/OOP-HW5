package fcu.iecs.oop.pokemon;

public class GYM {
	public static void fight(Pokemon p1, Pokemon p2) {
		Pokemon winner;
		if (Math.random() < 0.5) {
			winner = p1;
		} else {
			winner = p2;
		}
		winner.setCp(winner.getCp() + 500);
		System.out.println("Winner is " + winner.getName());

	}

}
