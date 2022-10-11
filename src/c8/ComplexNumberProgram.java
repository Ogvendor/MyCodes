package c8;

public class ComplexNumberProgram {
    public static void main(String[] args) {
        ComplexNumbers firstComplexNumber = new ComplexNumbers(4,8);
        System.out.print("Our first complex number is: ");
        firstComplexNumber.displayComplexNumbers();

        ComplexNumbers secondComplexNumber = new ComplexNumbers(3,6);
        System.out.print("Our Second complex number is: ");
        secondComplexNumber.displayComplexNumbers();

//        Add both complex numbers

        ComplexNumbers addition = new ComplexNumbers();
        addition = addition.addComplexNumbers(firstComplexNumber, secondComplexNumber);
        System.out.print("result for adding our complex number: ");
        addition.displayComplexNumbers();

        //        subtract complex numbers

        ComplexNumbers subtraction = new ComplexNumbers();
        subtraction = subtraction.subtractComplexNumbers(firstComplexNumber, secondComplexNumber);
        System.out.print("result for subtracting our complex number: ");
        subtraction.displayComplexNumbers();
    }
}
