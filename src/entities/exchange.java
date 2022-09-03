package entities;

public class exchange {
	
	public static double IOF = 0.06;
	public static double dolar;
	public static double buyDolar;
	
	public static double CurrencyConverter() {
		return dolar * buyDolar * (1.0 + IOF);
	}
	

}
