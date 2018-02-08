package codingexercises.workshop;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
	public static void main(String[] args) {
		diceRoll();

	}

	private static void diceRoll() {

		String diceChoice = null;
		System.out.println("What kind of dice roll should I simulate?");
		System.out.println("example: to simulate three throws of six side dice write 3d6");
		Scanner sc = new Scanner(System.in);
		diceChoice = sc.nextLine();
		sc.close();
		diceChoice = diceChoice.toUpperCase();

		String numberOfThrows = null;
		String dice = null;
		String opDice = null;
		int numbOfThr = 0;
		int dic = 0;
		int oD = 0;
		int throwResult = 0;

		Random r = new Random();

		if (diceChoice.contains("+")) {
			numberOfThrows = diceChoice.substring(0, diceChoice.lastIndexOf("D"));
			opDice = diceChoice.substring(diceChoice.indexOf("+") + 1, diceChoice.length());
			dice = diceChoice.substring(diceChoice.indexOf("D") + 1, diceChoice.indexOf("+"));

			if (numberOfThrows.equals("")) {
				numbOfThr = 1;
			} else {
				numbOfThr = Integer.parseInt(numberOfThrows);
			}
			oD = Integer.parseInt(opDice);
			dic = Integer.parseInt(dice);

			throwResult = ((r.nextInt(dic - 1) + 1) * numbOfThr) + oD;
			System.out.println(throwResult);
		} else if (diceChoice.contains("-")) {
			numberOfThrows = diceChoice.substring(0, diceChoice.lastIndexOf("D"));
			opDice = diceChoice.substring(diceChoice.indexOf("-") + 1, diceChoice.length());
			dice = diceChoice.substring(diceChoice.indexOf("D") + 1, diceChoice.indexOf("-"));

			if (numberOfThrows.equals("")) {
				numbOfThr = 1;
			} else {
				numbOfThr = Integer.parseInt(numberOfThrows);
			}
			oD = Integer.parseInt(opDice);
			dic = Integer.parseInt(dice);

			throwResult = ((r.nextInt(dic - 1) + 1) * numbOfThr) - oD;
			System.out.println(throwResult);
		} else if (diceChoice.contains("*")) {
			numberOfThrows = diceChoice.substring(0, diceChoice.lastIndexOf("D"));
			opDice = diceChoice.substring(diceChoice.indexOf("*") + 1, diceChoice.length());
			dice = diceChoice.substring(diceChoice.indexOf("D") + 1, diceChoice.indexOf("*"));

			if (numberOfThrows.equals("")) {
				numbOfThr = 1;
			} else {
				numbOfThr = Integer.parseInt(numberOfThrows);
			}
			oD = Integer.parseInt(opDice);
			dic = Integer.parseInt(dice);

			throwResult = ((r.nextInt(dic - 1) + 1) * numbOfThr) * oD;
			System.out.println(throwResult);
		} else if (diceChoice.contains("/")) {
			numberOfThrows = diceChoice.substring(0, diceChoice.lastIndexOf("D"));
			opDice = diceChoice.substring(diceChoice.indexOf("/") + 1, diceChoice.length());
			dice = diceChoice.substring(diceChoice.indexOf("D") + 1, diceChoice.indexOf("/"));

			if (numberOfThrows.equals("")) {
				numbOfThr = 1;
			} else {
				numbOfThr = Integer.parseInt(numberOfThrows);
			}
			oD = Integer.parseInt(opDice);
			dic = Integer.parseInt(dice);

			throwResult = ((r.nextInt(dic - 1) + 1) * numbOfThr) / oD;
			System.out.println(throwResult);
		} else {
			numberOfThrows = diceChoice.substring(0, diceChoice.lastIndexOf("D"));
			dice = diceChoice.substring(diceChoice.indexOf("D") + 1, diceChoice.length());

			if (numberOfThrows.equals("")) {
				numbOfThr = 1;
			} else {
				numbOfThr = Integer.parseInt(numberOfThrows);
			}
			dic = Integer.parseInt(dice);
			throwResult = ((r.nextInt(dic - 1) + 1) * numbOfThr);
			System.out.println(throwResult);
		}

	}

}
