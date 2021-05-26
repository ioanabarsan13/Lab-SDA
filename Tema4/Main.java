package Tema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int sir[] = { 12, 25, 47, 58, 47, 7, 96, 14, 3, 9 };
		int a, pos;
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Introduceti numarul ce trebuie adaugat");
		a = Integer.parseInt(x.readLine());
		System.out.println("Introduceti pozitia pe care se va adauga");
		pos = Integer.parseInt(x.readLine());

		sir = addX(pos, sir, a);

		System.out.println(Arrays.toString(sir));

		System.out.println("Introduceti pozitia elementului care va fi eliminat");
		pos = Integer.parseInt(x.readLine());

		sir = removeX(pos, sir);
		System.out.println(Arrays.toString(sir));

		Arrays.sort(sir);
		System.out.println("Sirul este de forma:");
		System.out.println(Arrays.toString(sir));

		System.out.println("Introduceti numarul ce va fi cautat");
		int search = Integer.parseInt(x.readLine());
		if (searchElem(search, sir))
			System.out.println("Numarul a fost gasit la index: " + Arrays.binarySearch(sir, search));
		else
			System.out.println("Numarul nu exista in sir");

	}

	public static int[] addX(int pos, int arr[], int x) {

		int i;
		int newarr[] = new int[arr.length + 1];
		for (i = 0; i < arr.length + 1; i++)
			if (i < pos)
				newarr[i] = arr[i];
			else if (i == pos)
				newarr[i] = x;
			else
				newarr[i] = arr[i - 1];

		return newarr;

	}

	public static int[] removeX(int pos, int arr[]) {

		int removed[] = new int[arr.length - 1];
		for (int i = 0, k = 0; i < arr.length; i++) {

			if (i != pos) {
				removed[k] = arr[i];
				k++;
			} else
				continue;
		}

		return removed;
	}

	public static boolean searchElem(int src, int arr[]) {

		if (Arrays.binarySearch(arr, src) != 0)
			return true;
		else
			return false;

	}
}