package Tema2P3;

public class Main {

	public static void main(String[] args) {
		
		Adress ad1 = new Adress("Salcamilor", "Bucuresti", 25);
		PaymentMethod pay1 = new PaymentMethod("Card");
		Customer c1 = new Customer("Popescu", "Maria",ad1, pay1, 21 );
		
		System.out.println(c1.getCompleteName());
		System.out.println(c1.getAdress().getFullAdress());
		System.out.println(c1.getPayMethod().getType());
	}
}
