package demo;

public class TestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stock myStock = new Stock("ORCL", "Oracle Corporation");
		
		myStock.previousClosingPrice = 34.5;
		myStock.currentPrice = 34.35;
		
		System.out.println("Price changed by " + myStock.getChangePercent() + "%%");
		
		
	}

}
