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
}
