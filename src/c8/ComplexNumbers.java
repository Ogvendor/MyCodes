package c8;

public class ComplexNumbers {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumbers(){}
    public ComplexNumbers(double realPart,double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;

    }

    public ComplexNumbers addComplexNumbers(ComplexNumbers one, ComplexNumbers two){
        ComplexNumbers numbers = new ComplexNumbers();

        numbers.realPart = one.realPart + two.realPart;

        numbers.imaginaryPart = one.imaginaryPart + two.imaginaryPart;

        return numbers;
    }

    public ComplexNumbers subtractComplexNumbers(ComplexNumbers one, ComplexNumbers two){
        ComplexNumbers numbers = new ComplexNumbers();

        numbers.realPart = one.realPart - two.realPart;

        numbers.imaginaryPart = one.imaginaryPart - two.imaginaryPart;

        return numbers;
    }

    public void displayComplexNumbers(){
        System.out.println(realPart + " + " + imaginaryPart + "i");
    }

}
