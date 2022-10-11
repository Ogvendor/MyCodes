package c5.TrianglePrinting;

public class TrianglePrinting {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
       }
        System.out.println();

        for (int row = 1; row <= 5; row++) {
            for (int column = 5; column >= row; column--) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println();
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("  ");
            }
            for (int column1 = 5; column1 >= row; column1--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 5-row; column++) {
                System.out.print("  ");
            }
            for (int column1 = 1;column1 <= row; column1 ++){
                System.out.print("* ");

            }
                System.out.println();
        }
        System.out.println();





        }




    }



