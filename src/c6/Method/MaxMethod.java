package c6.Method;

public class MaxMethod {
//    public static void main(String[] args){
//        int x = 5;
//        int y = 2;
//        int z = max(5,2);
//        System.out.println("The max of " + x + " and " + y + " is " + z);
//    }




    public static int max(int x, int y){
        int result;

        if (x > y)
            result = x;
        else
            result = y;

        return result;

    }


}
