package c5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FairTaxException {
        Scanner input = new Scanner(System.in);

        FairTax fairTax = new FairTax();

        System.out.println("number of products? \n");
        int numberOfProducts = input.nextInt();

        if (numberOfProducts < 1) throw new FairTaxException("product number cannot be" + numberOfProducts);

        for (int v = 1;v <= numberOfProducts;v++){
            System.out.printf("enter product %d 's name\n", v );
            String productName = input.next();

            System.out.printf("Enter price of %s \n", productName);
            double productPrice = input.nextDouble();

            Product product = new Product(productName,productPrice);
            fairTax.calculateToTalPrice(product.getPrice());
        }
        double grandTotal = fairTax.getTotalPrice();
        fairTax.calculateTax(grandTotal);
        System.out.println("pay %f now!! " + fairTax.calculateTax(grandTotal));


    }
}
