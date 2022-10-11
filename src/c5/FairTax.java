package c5;

public class FairTax {
    private final double fairTaxRate = 23.00;
    private double totalPrice = 0.0;
    public double calculateTax(double price) {
        return (fairTaxRate/100) * price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double calculateToTalPrice(double price) {
         totalPrice +=price;
         return totalPrice;

    }
}
