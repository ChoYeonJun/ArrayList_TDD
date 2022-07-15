package com.example.arraylist;

public class ArrayList {

    int lastIndex;
    private int size;
    int[] array;

    public ArrayList() {
        lastIndex = 0;
        size = 2;
        array = new int[size];

    }

    public int size(){
        return size;
    }

    public void add(int data){
        if(lastIndex >= size){
            size *= 2;
            int[] temp = new int[size];
            for(int i = 0; i < lastIndex; i++){
                temp[i] = array[i];
            }

            array = temp.clone();
        }

        array[lastIndex] = data;
        lastIndex++;
    }

    public int get(int index){
        return array[index];
    }

    public void removeAt(int index){
        for(int i = index; i < lastIndex-1; i++){
            array[i] = array[i+1];
        }
        size--;
    }

    public int getArrayLength(){
        return array.length;
    }

    public void showAllValues(){
        System.out.println("== 전체 데이터 출력 ==");
        for(int i = 0; i < lastIndex; i ++)
            System.out.printf("%d : %d", i, array[i]);
    }
}
