package dataStructures;

public interface List {

    boolean isEmpty();

    void add(int value);

    void remove(int element);

    int size();

    void add(int element, int position);

    int get(int index);

    int getIndexOf(int element);

    int getCapacity();

    void insert(int element, int index);
}
