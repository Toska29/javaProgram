package dataStructures;

import java.util.Arrays;

public class ArrayList implements List {
    private int size;
    private int element;
    private int[] elements;

    public ArrayList(){
        elements = new int[6];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(int element) {
        boolean isFull = getCapacity() == size();
        if(isFull) {
            int[] newArray = new int[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
        }
        elements[size++] = element;
        //size++;
    }

    public int getCapacity() {
        return elements.length;
    }

    @Override
    public void insert(int element, int index) {
        size++;
        int[] newArray = new int[elements.length];
        boolean isFull = getCapacity() == size;
        if(isFull) {
            newArray = new int[elements.length*2];
        }
        for (int i = 0; i <= index; i++) {
            if (i == index){
                newArray[i] = element;
                for (int j = i; j < size; j++) {
                    newArray[j+1] = elements[j];
                }
            }
            else{
            newArray[i] = elements[i];
            }
        }
        elements = newArray;
    }

    @Override
    public void remove(int element) {
        if(isEmpty()) throw new IllegalArgumentException("ArrayList is empty");
        size--;
        int[] newArray = new int[elements.length];
        int number = getIndexOf(element) + 1;
        for (int i = 0; i < number; i++) {
            if(elements[i] == element){
                for (int j = i; j < size; j++) {
                    newArray[j] = elements[j+1];
                }
            }
            else {
                newArray[i] = elements[i];
            }
        }
        elements = newArray;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int element, int position) {
       elements[position] = element;
    }

    @Override
    public int get(int index) {
        return elements[index];
    }

    @Override
    public int getIndexOf(int element) {
        for (int i = 0; i < elements.length; i++) {
            if(elements[i] == element)
                return i;
        }
        return 0;
    }

}
