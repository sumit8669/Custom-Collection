public class MyCollection{

    private Object [] myArray;
    private int size;

    MyCollection(){
        myArray = new Object[10];
        size =0;
    }

    public void add(Object obj){
        if (size == myArray.length){
            increaseCapacity();
        }
        myArray[size] = obj;
        size++;
    }

    private void increaseCapacity() {
        Object [] newArray = new Object[myArray.length*2];
        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
        }
        myArray = newArray;
    }
    public int getSize(){
        return size;
    }
    public int getCapacity(){return myArray.length;}

    public Object getElement(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return myArray[index];
    }


    public void replaceElement(int index , Object obj){
        if (index < 0 || index > size-1 )

            throw  new IndexOutOfBoundsException(index);

         myArray[index] = obj;
    }


}