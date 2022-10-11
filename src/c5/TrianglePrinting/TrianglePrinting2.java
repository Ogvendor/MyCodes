package c5.TrianglePrinting;

public class TrianglePrinting2 {
    public static void main(String[] args) {

        for (int gloop = 1;gloop <= 5;gloop++){
            for (int firstT = 1; firstT <= gloop;firstT++){
                System.out.print("* ");
            }
        for (int firstS = 1;firstS <= 6-gloop;firstS++){
            System.out.print("  ");
        }
        for (int secondT = 1;secondT <= 6-gloop;secondT++){
            System.out.print("* ");
        }
        for(int secondS = 1;secondS <= 1 +(2*gloop);secondS++){
            System.out.print("  ");
        }
        for(int thirdT = 1;thirdT <= 6-gloop;thirdT++){
            System.out.print("* ");
        }
            for (int thirdS = 1;thirdS <= 6-gloop;thirdS++) {
                System.out.print(" ");
            }
        for (int lastT = 1; lastT <= gloop;lastT++){
                System.out.print("*");
        }
            System.out.println();


        }
    }
}
