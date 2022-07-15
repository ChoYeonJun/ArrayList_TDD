package com.example.arraylist;

public class ArrayList {

    private int size;
    int[] array;

    public ArrayList() {
        size = 0;
        array = new int[2];

    }

    public int size(){
        return size;
    }

    public void add(int data){
        if(size >= array.length){
            int[] temp = new int[array.length*2];
            for(int i = 0; i < size; i++){
                temp[i] = array[i];
            }
            array = temp.clone();
        }

        array[size] = data;
        size ++;
    }

    public int get(int index){
        return array[index];
    }

    public void removeAt(int index){
        for(int i = index; i < size-1; i++){
            array[i] = array[i+1];
        }
        size--;
    }

    public int getArrayLength(){
        return array.length;
    }

    public void showAllValues(){
        System.out.println("== 전체 데이터 출력 ==");
        for(int i = 0; i < size; i ++)
            System.out.printf("%d : %d", i, array[i]);
    }
}
