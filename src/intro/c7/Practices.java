package intro.c7;

public class Practices {
    public static void main(String[] args) {
        int[] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
        int[] frequency = new int[6];
        for (int answers = 0; answers < responses.length;answers++){
            try{
                ++frequency[responses[answers]];
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("  responses[%d] = %d%n%n",answers , responses[answers]);
            }
        }
        System.out.printf("%s%10s%n","Rating", "Frequency");
         for (int rating = 1; rating < frequency.length;rating++){
             System.out.printf("%6d%10d%n",rating,frequency[rating]);
         }
    }
}
