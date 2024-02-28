package datastr;

import java.util.ArrayList;

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

    //TODO
    //1. funkcijas deklaracija
    //2. ja bus ienakosais paramtrs, to japarbauda
    //3. aretinat newSize
    //4. izveidot listNew ar newSize izmeru
    //5. veikt viena masivu kopesanu uz otro
    //6.nomainam list referenci uz listNew
    //7. izveidot Garbage Collector
    //8. size nomainam uz newSize
    private void resize(){
        int newSize = (counter <= 100)? size*2 : (int) (size * 1.5);

        /*
        if(counter <= 100){
            int newSize =  size * 2;
        }
        else {
            int newSize = (int)(size * 1.5);
        }

         */
        //4. izveidot listNew ar newSize izmeru
        int[] listNew = new int[newSize];
        //5. veikt viena masivu kopesanu uz otro
        for (int i = 0; i < size; i++){
            listNew[i] = list[i];
        }
        //6.nomainam list referenci uz listNew
        list = listNew;
        //7. izveidot Garbage Collector
        System.gc();
        //8. size nomainam uz newSize
        size = newSize;
    }
    //TODO
    //1.funkcijas deklaracija
    //2. parbaude isFull - tad resize
    //3.ielikam jauna elementu ka pedeju saraksta
    //4.palielinam counter

    public void add(int element){
        if(isFull()){
            resize();
        }
        list[counter++] = element; //counter++ pec pluso un ++counter pirms pluso
    }

    public void add(int element, int index) throws Exception {
        if (index < 0 || index >= counter){
            throw new Exception("Incorect index");
        }
        if(isFull()){
            resize();
        }
        if(index == counter) add(element);
        else {
            for (int i = counter; i > index; i--){
                list[i] = list[i-1];
            }
            list[index] = element;
            counter++;
        }

    }

    public void remove(int index) throws Exception {
        if (index < 0 || index >= counter){
            throw new Exception("Incorrect index");
        }
        if (isEmpty()) throw new Exception("Empty list");

        for (int i = index; i < counter-1; i++ ){
            list[i] = list[i+1];
        }

        counter--;
    }

    public int getElementFromIndex(int index) throws Exception {
        if (index < 0 || index >= counter){
            throw new Exception("Incorrect index");
        }
        if (isEmpty()) throw new Exception("Empty list");
        return list[index];
    }

    public ArrayList search(int element) throws Exception {
        if (isEmpty()) throw new Exception("Empty list");
        ArrayList indexes = new ArrayList();

        for (int i = 0; i < counter; i++){
            if(list[i] == element){
                indexes.add(i);
            }

        }
        return indexes;
    }

    
}
