package Tema2P2;

import java.util.*;

public class P2 {
	
	public static void main(String[] args) {
		
	List<Double> sir = new ArrayList<Double>();
	sir.add(32.5);
	sir.add(35.0);
	sir.add(35.2);
	sir.add(38.9);
	sir.add(36.5);
	sir.add(37.9);
	
		
	List<Double> anormalTemp = new ArrayList<>();
	List<Double> normalTemp = new ArrayList<>();
	
	for(int i=0; i<=sir.size()-1; i++) 
		if(sir.get(i) <=37.0 ) {
			anormalTemp.add(sir.get(i));
		}else {
			normalTemp.add(sir.get(i));
			}
	
	System.out.println("Temperaturile normale sunt : " + normalTemp );	
	System.out.println("Temperaturile anormale sunt: " + anormalTemp);
		}
}
