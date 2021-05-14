package Tema3;

public abstract class HexColorValidator {

	public static Boolean validate(String colorHex) {

		
		return colorHex.length() ==7 && colorHex.matches("#[0-9[a-f]]+");
	}
}