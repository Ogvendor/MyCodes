package c17;

import java.util.stream.IntStream;

public class MoreExample {
    public static void main(String[] args) {
        System.out.printf("num of the even ints from 2 through 20 is: %d%n" , IntStream.rangeClosed(1,10).map((int x)-> {return x * 2;}).sum());
    }
}
