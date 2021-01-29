package com.beyondiary.hello.datastructure.array;

/**
 * @author Beyondiary
 * @author <a href="mailto:beyondefined@gmail.com">Mark Chung</a>
 * @date 2021-01-30 00:53
 */
public class Array {
    private int[] data;
    private int size;

    public Array(int capacity) {
        this.data = new int[capacity];
        this.size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return 0 == size;
    }

    public void addLast(int e){
        /*
        if(size == data.length){
            throw new IllegalArgumentException("array is full");
        }
        data[size] = e;
        size++;
        */
        add(size, e);
    }

    public void addFirst(int e){
        add(0, e);
    }

    public int get(int index){
        if(index < 0 || index >=size){
            throw new IllegalArgumentException("index illegal");
        }
        return data[index];
    }

    public void set(int index, int e){
        if(index < 0 || index >=size){
            throw new IllegalArgumentException("index illegal");
        }
        data[index] = e;
    }

    public void add(int index, int e){
        if(size == data.length){
            throw new IllegalArgumentException("array is full");
        }
        if(index < 0 || index > size){
            throw new IllegalArgumentException("index illegal");
        }
        for (int i = size - 1; i >=index ; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("array size %d, capacity %d \n", size, data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if(i != size - 1){
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }
}
