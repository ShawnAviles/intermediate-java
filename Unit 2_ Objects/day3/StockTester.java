package day3;

public class StockTester {
    public static void main(final String[] args) {
        final Stock s = new Stock ("ORCL","Oracle Operation");
        s.setPreviousClosingPrice(34.5);
        s.setCurrentPrice(50);

        System.out.println(s.getChangePercent());
        System.out.println(s);
        }
    }
