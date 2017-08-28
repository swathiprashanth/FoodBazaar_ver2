package Items;

public class PriceCalculation {

    public int iTemsCost_Calc(int price, int quantity) {
        return (price * quantity);
    }

    public double iTemsCost_Calc(double price, int quantity) {
        return (price * quantity);
    }

    public double iTemsCost_Calc(int price, double quantity) {
        return (price * quantity);
    }

    public double iTemsCost_Calc(double price, double quantity) {
        return (price * quantity);
    }

}
