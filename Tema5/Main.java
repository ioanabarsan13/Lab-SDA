 package Tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		HashMap<String, StudentDetails> map = new HashMap<>();

		String last_names[] = { "Ganea", "Trandafir", "Stoica", "GHeorghe", "Constantin", "Marin", "Ciobanu", "Anghel",
				"Muresan", "Marinescu" };
		String first_names[] = { "Andreea", "Paul", "Ioana", "Elena", "Denis", "Florin", "Catalina", "Ana", "Mircea",
				"Marcel" };
		String CNPs[] = { "1284920461284", "7829156394021", "8920456729343", "9234612739201", "1284934561284",
				"7829156673021", "1563729634731", "9234616739201", "1284322461284", "9261612737201" };

		Random r = new Random();

		for (int k = 0; k <= 9; k++) {
			ArrayList<Double> note1 = new ArrayList<>();
			ArrayList<Double> note2 = new ArrayList<>();
			for (int i = 0; i <= 3; i++) {

				double randomValue = 1 + (10 - 1) * r.nextDouble();
				note1.add(randomValue);

			}

			for (int j = 0; j <= 3; j++) {
				double randomValue = 1 + (10 - 1) * r.nextDouble();
				note2.add(randomValue);
			}


			map.put(CNPs[k], new StudentDetails(last_names[k], first_names[k], note1, note2));

		}

		// 1.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Punctul 1.");
		System.out.println("Introduceti CNP student:");
		String CNP = scan.nextLine();
	
		StudentDetails s1 = map.get(CNP);
		System.out.println("Numele: " + s1.getNume());
		System.out.println("Prenumele : " + s1.getPrenume());
		System.out.println("Notele Limba Romana: " + s1.getNoteLbRomana());
		System.out.println("Notele Matematica: " + s1.getNoteMatematica());
		System.out.println();
		

		//2.
	
		System.out.println("Punctul 2.");
		System.out.println("CNP-urile studentilor sunt:"+ map.keySet());
		System.out.println();
		
		
		
		// 3.

		LinkedHashMap<String, StudentDetails> students = new LinkedHashMap<>();

		String l_last_names[] = { "Popescu", "Ionescu", "Pop", "Stoica", "Constantin", "Florea", "Ciobanu", "Anghel",
				"Muresan", "Marinescu" };
		String l_first_names[] = { "Andrei", "Maria", "Ioana", "Mihai", "Constantinescu", "Florin", "Catalina", "Ana",
				"Mircea", "Marcel" };
		String l_CNPs[] = { "1284920461284", "7829156394021", "8920456729343", "9234612739201", "1284934561284",
				"7829156673021", "1563729634731", "9234616739201", "1284322461284", "9261612737201" };

		Random r2 = new Random();

		for (int k = 0; k <= 9; k++) {
			ArrayList<Double> note3 = new ArrayList<>();
			ArrayList<Double> note4 = new ArrayList<>();

			for (int i = 0; i <= 1; i++) {

				double randomValue = 1 + (10 - 1) * r.nextDouble();
				note3.add(randomValue);
			}

			for (int i = 0; i <= 1; i++) {
				double randomValue = 1 + (10 - 1) * r.nextDouble();
				note4.add(randomValue);
			}

			

			students.put(CNPs[k], new StudentDetails(l_last_names[k], l_first_names[k], note3, note4));

		}
		
		//4.
	
		System.out.println();
		System.out.println("Punctul 4.");
		System.out.println( "Elementele inserate in LinkedHasMap sunt:  " + students);
		System.out.println();
		
		
	
		
		//5.
		ArrayList<Double> arr1 = new ArrayList<>();
		ArrayList<Double> arr2 = new ArrayList<>();

		for (int i = 0; i <= 1; i++) {

			double randomValue = 1 + (10 - 1) * r.nextDouble();
			arr1.add(randomValue - randomValue % 1);
		}

		for (int i = 0; i <= 1; i++) {
			double randomValue = 1 + (10 - 1) * r.nextDouble();
			arr2.add(randomValue - randomValue % 1);
		}
		StudentDetails s3 = new StudentDetails("Oprea", "Octavian", arr1, arr2);
		map.put("1284920461284", s3);
		StudentDetails s4 = map.get(CNP);
		System.out.println("Punctul 5.");
		System.out.println("Numele " + s4.getNume());
		System.out.println("Prenumele  " + s4.getPrenume());
		System.out.println("noete limba romana"+ s4.getNoteLbRomana());
		System.out.println("note matematica" + s4.getNoteMatematica());
	}
}

