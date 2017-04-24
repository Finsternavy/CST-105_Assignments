package demo;

public class Stock {

	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	public Stock(String newSymbol, String newName) { //constructor
		symbol = newSymbol;
		name = newName;	
	}
	
	public double getChangePercent() {
		return (currentPrice - previousClosingPrice) / previousClosingPrice;
	}
	
	public void setPreviousClosingPrice(double newPreviousClosingPrice) {
		previousClosingPrice = newPreviousClosingPrice;
	}
	
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	
	public void setCurrentPrice (double newCurrentPrice) {
		currentPrice = newCurrentPrice;
	}
	
	public double getCurrentPrice() {
		return currentPrice;
	}
	
	public void setSymbol(String newSymbol) {
		symbol = newSymbol;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
}