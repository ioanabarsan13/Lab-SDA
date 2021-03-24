package Tema1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

public static void main(String args[]) throws IOException{
		
		int x, y;
		int sum,dif,prod,max,min;
		double dist, avr;
		BufferedReader nr = new BufferedReader(new InputStreamReader(System.in));
		 x = Integer.parseInt(nr.readLine());
		 y = Integer.parseInt(nr.readLine());
		
		 sum = x + y;
		 dif = x - y;
		 prod = x*y;
		 avr = sum / 2;
		 dist = Math.abs(x+y);
		 
		 
		 if (x>y) {
			 max = x; 
			 min = y;
		 }else {
			 max = y;
			 min = x;
			 }
		 
		 System.out.println("Input 1st integer: " + x);
		 System.out.println("Input 2st integer: " + y);
		 System.out.println("Sum of integers : " + sum);
		 System.out.println("Difference of integers : " + dif);
		 System.out.println("Product of two integers : " + prod);
		 System.out.println("Average of two integers : " + avr);
		 System.out.println("Distance of two integers : " + dist);
		 System.out.println("Maxim integer : " + max);
		 System.out.println("Minim integer : " + min);
	}
}
