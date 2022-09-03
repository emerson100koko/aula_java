package application;

import java.util.Locale;
import java.util.Scanner;

import entities.exchange;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		exchange exchange = new exchange();
		
		System.out.print ("Whats is the dollar value? ");
		exchange.dolar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		exchange.buyDolar = sc.nextDouble();
		
		System.out.printf("amount to be paid in reais = %.2f%n", exchange.CurrencyConverter());
		
	}

}
