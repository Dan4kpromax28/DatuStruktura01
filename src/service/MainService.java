package service;

import datastr.MyArrayList;

import java.util.Arrays;

public class MainService {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList(3);

        myList.add(100);
        myList.add(200);
        myList.add(-100);

        try{
            myList.print();
            myList.add(1, 1000);
            myList.remove(0);
            myList.print();
            myList.add(200);
            myList.add(200);
            System.out.println(myList.search(200));
            System.out.println(Arrays.toString(myList.getNeighbours((200))));
            myList.print();
            myList.bubbleSort();
            

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
