package Tema5;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentDetails {

	String nume, prenume;
	ArrayList<Double> noteLbRomana = new ArrayList<Double>();
	ArrayList<Double> noteMatematica = new ArrayList<Double>();

	public StudentDetails(String nume, String persoane, ArrayList<Double> noteLbRomana,
			ArrayList<Double> noteMatematica) {
		super();
		this.nume = nume;
		this.prenume = persoane;
		this.noteLbRomana = noteLbRomana;
		this.noteMatematica = noteMatematica;
	}

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public ArrayList<Double> getNoteLbRomana() {
		return noteLbRomana;
	}

	public ArrayList<Double> getNoteMatematica() {
		return noteMatematica;
	}

	@Override
	public String toString() {
		return "Numele " + nume + ",prenumele " + prenume + ", note limba romana" + noteLbRomana
				+ ",note matematica" + noteMatematica;
	}
	
	

}