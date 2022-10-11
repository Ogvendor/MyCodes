package c7;

import intro.c7.Array;

import java.util.Arrays;

public class Thrift2 {
    public static void main(String[] args) {
    Thrift2 account = new Thrift2();
    getName();
        Thrift thrift = new Thrift(3,30.0);
        String[] list = thrift.getParticipantList();
        list[0] = "A";
        list[1] = "B";
        list[2] = "C";
        for (int v = 0;v< list.length;v++){
            System.out.println(list);
        }

        String[] newNames = {"A","B","C","t"};
        thrift.setParticipantList(newNames);
        System.out.println(Arrays.toString(newNames ));







    }
    public static void getName(){

    }
}
