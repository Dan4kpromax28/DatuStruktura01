package datastr;

public class MyArrayList {

    private int[] list;
    private final int LIST_DEFAULT_SIZE = 10;//final ir constatnta
    private int size = LIST_DEFAULT_SIZE;
    private int counter = 0; // cik elementi ir

    //TODO
    //construktors
    public MyArrayList(){
        list = new int[size];
    }
    public MyArrayList(int inputSize){
        if(inputSize > 0) {
            size = inputSize;
        }
        list = new int[size];
    }
    //isEmpty
    public boolean isEmpty(){
        // 1. long if-else
       /* if (counter == 0){
            return true;
        }else
            return false;*/
        //2. Short if-else
        //return (counter == 0)? true : false;
        //3.
        return (counter==0);
    }



    // isFull
    public boolean isFull(){
        return (counter == size);
    }
    // howManyElements
    public int howManyElements(){
        return counter;
    }
}
