package intro.c7;

import java.util.Scanner;

public class Array {

   static double[] num = {1.2,2.4,3.1,5.1,2.1,3.2,1.5,4.3,5.5};

    public static void main(String[] args) {

        double total = 0;
        for(int v = 0;v < num.length;v++){
            total += num[v];

        }
        System.out.println("Sum is " + total);

        double min = num[0];
        for(int v = 0;v < num.length;v++) {
            if (num[v] < min)
                min = num[v];
        }
        System.out.println("min is " + min);

        }





//        int x = 30;
//        int[] numbers = new int[x];
//        x=60;
//        System.out.println("x is " + x);
//        System.out.println("The size of numbers is " + numbers.length);
//        Scanner input = new Scanner(System.in);
//      String[] months = {"January","Febuary","March","April","May","June","July","August","Septmeber","October","November","December"};
//        System.out.println("Enter number from 1 to 12: ");
//      int monthNumber = input.nextInt();
//        System.out.println("The month is " + months[monthNumber - 1]);

//        double[] myList = {2.1,2.2,2.4,2.5};
//
//        double max = myList[0];
//        for(int v = 1;v < myList.length;v++){
//            if(myList[v] > max)max = myList[v];
//        }
//        System.out.println(max);
//
//        double min = myList[0];
//        for(int v = 1;v < myList.length;v++){
//            if(myList[v] < min)min = myList[v];
//        }
//        System.out.println(min);
//        double[] myList = new double[10];
//        myList[0] = 1;
//        myList[1] = 2;
//        myList[2] = 3;
//        myList[3] = 4;
//        myList[4] = 5;
//        myList[5] = 6;
//        myList[6] = 7;
//        myList[7] = 8;
//        myList[8] = 9;
//        myList[9] = 10;
//
//
//        double total = 0;
//
//        for(int v = 0; v < myList.length;v++){
//            total += myList[v];
//
//        }
//        System.out.println(total);
//        char[] city = {'D','a','l','l','a','s'};
//        System.out.println(city);
// Scanner input = new Scanner(System.in);
//double[] myList = {1.9,2.9,3.4,3.5};
//
//        System.out.println("Enter "+ myList.length + " values ");
//        for(int v = 0;v < myList.length;v++) {
//            myList[v] = input.nextDouble();
//        }
//        for(int v = 0;v < myList.length;v++){
//            myList[v] = Math.random() * 100;
//        }







//        int[] value = new int[10];
//
//        value[0] = 1;
//        value[1] = 2;
//        value[2] = 3;
//        value[3] = 4;
//        value[4] = 5;
//        value[5] = 6;
//        value[6] = 7;
//        value[7] = 8;
//        value[8] = 9;
//        value[9] = 10;
//
//        for (int v = 0; v < value.length; v++) {
//
//            System.out.println("index " + v + " = " + value[v]);
//        }

//        int[] value2 = new int[10];
//          for(int v = 0; v < value.length; v++){
//              System.out.println("index " + v + " = " + value2[v]);
//          }
//        int var = 2;
//          int[] value3 = new int[10];
//          for(int v = 0; v < value3.length; v++){
//              value3[v] = var;
//              var += 2;
//
//
//
//              System.out.println("index " + v + " = " + value3[v]);
//          }
//          int var2 = 1;
//          int[] value4 = new int[10];
//          for(int v = 0; v < value4.length; v++){
//              value4[v] = var2;
//              var2 += 2;
//              System.out.println("index " + v + " = " + value4[v]);
//
//              value4[5] = 12;
//              value4[7] = 16;
//              value4[9] = 20;
//
//
//              System.out.println("index 5  " + value4[5]);
//              System.out.println("index 7  " + value4[7]);
//              System.out.println("index 9  " + value4[9]);



        

    }

