package Tema2P1;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {

		String o = "oras";
		String r = "zona rezidentiala";
		String e = "drum express";
		String a = "autostrada";

		String userInput;

		Scanner s = new Scanner(System.in);
		userInput = s.next();

		// if else
		if (o.equals(userInput)) { // oras
			System.out.println(o + " - 50");
		} else {

			if (r.equals(userInput)) { // zona rezidentiala
				System.out.println(r + " - 30");
			} else {

				if (e.equals(userInput)) { // drum express
					System.out.println(e + " - 100");
				} else {

					if (a.equals(userInput)) { // autostrada
						System.out.println(a + " - 130");
					}

				}
			}

			// if{} else{if{}}
			if (o.equals(userInput)) { // oras
				System.out.println(o + " - 50");
			} else if (r.equals(userInput)) { // zona rezidentiala
				System.out.println(r + " - 30");
			} else if (e.equals(userInput)) { // drum express
				System.out.println(e + " - 100");
			} else if (a.equals(userInput)) { // autostrada
				System.out.println(a + " - 130");
			} else {
				System.out.println("Alegerea nu corespunde unei categorii de drum");
			}

			// switch()
			switch (userInput) {
			case "oras":
				System.out.println(o + " - 50");
				break;
			case "zona rezidentiala":
				System.out.println(r + " - 30");
				break;
			case "drum express":
				System.out.println(e + " - 100");
				break;
			case "autostrada":
				System.out.println(a + " - 130");
				break;
			default:
				System.out.println("Alegerea nu corespunde unei categorii de drum");
			}
		}
	}

}
