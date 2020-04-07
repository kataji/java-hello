package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ÄãºÃ");
		Scanner in = new Scanner(System.in);
		double amount;
		double price;
		System.out.print("Please input amount: ");
		amount = in.nextDouble();
		System.out.print("Please input price: ");
		price = in.nextDouble();
		System.out.println("Change is " + amount + "-" + price + "=" + (amount-price));
	}

}
