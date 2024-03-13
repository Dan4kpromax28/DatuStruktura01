package service;

import datastr.MyArrayList;
import datastr.model.Students;

import java.util.Arrays;

public class MainService {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<Integer>(3);

        myList.add(100);
        myList.add(200);
        myList.add(-100);

        try{
            myList.print();
            myList.add(10000, 1);
            myList.remove(0);
            myList.print();
            myList.add(200);
            myList.add(200);
            System.out.println(myList.search(200));
            System.out.println(Arrays.toString(myList.getNeighbours((200))));
            myList.print();
            myList.bubbleSort();
            myList.print();


        } catch (Exception e){
            e.printStackTrace();
        }


        MyArrayList<Students> allStudents = new MyArrayList<>();

        Students s1 = new Students("Janiis", "Balika");
        Students s2 = new Students("Kurts", "Sula");
        Students s3 = new Students("Andzejs", "Kira");


        allStudents.add(s1);
        allStudents.add(s2);

        try {
            allStudents.add(s3,0);
            allStudents.print();

            System.out.println(allStudents.search(s1));
            System.out.println(Arrays.toString(allStudents.getNeighbours(s1)));

            allStudents.print();
            allStudents.bubbleSort();
            allStudents.print();

            allStudents.remove(1);
            allStudents.print();

            allStudents.makeEmpty();
            allStudents.add(s1);
            allStudents.print();


        } catch (Exception e) {
            System.out.println(e);
        }



    }
}
