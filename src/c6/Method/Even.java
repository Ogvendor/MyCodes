package c6.Method;

public class Even {
    public static void main(String[] args) {
        for (int v = 0;v < 20; v++){
            System.out.println(isEven(v));
        }
    }
    public static boolean isEven(int num){
        if (num % 2 == 0)
            return true;
        else
        return false;
    }
}
