package udemy;

public class SumLoop {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for (int v = 1; v <= 1000; v++) {
            if ((v % 3 == 0) && (v % 5 == 0)) {
                System.out.println("Divisible numbers are: " + v);
                count++;
                sum += v;

            }
            if (count == 5) {
                break;
            }

        }
        System.out.println("Sum total is: " + sum);
    }
}

