package day3;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
        previousClosingPrice = 0;
        currentPrice = 0;


    }

    public double getChangePercent(){
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;

    }

    public void setPreviousClosingPrice (double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice (double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String toString() {
        return String.format(name + " (" + symbol + "): %.1f" , currentPrice);
    }



}