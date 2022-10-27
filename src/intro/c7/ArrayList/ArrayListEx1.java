package intro.c7.ArrayList;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(10);
        list.add("red");
        list.add(0,"yellow");

        System.out.print("Display list contents with counter-controlled loop:");

        for (int i = 0;i < list.size();i++){
            System.out.printf("%s", list.get(i));
        }
        display(list,"%nDisplay list contents with enhanced for statement:");

        list.add("Green");
        list.add("yellow");
        list.add("White");
        display(list, "List with two new elements");

        list.remove("White");
        display(list,"Remove first instance of White");

        list.remove(1);
        display(list,"Remove second element ");

        System.out.printf("\"red\" is %sin the list%n",list.contains("red") ? "": "not");

        System.out.printf("Size: %s%n", list.size());
    }
    public static void display(ArrayList<String> list,String header){
        System.out.println(header);

        for (String lists : list){
            System.out.printf(" %s", lists);
        }
        System.out.println();
    }
}
