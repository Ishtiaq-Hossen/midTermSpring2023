package com.example.midtermspringsolve;

import java.util.ArrayList;

public class ArrayModel {
    ArrayList<Integer> arr1=new ArrayList<Integer>();;
    ArrayList<Integer> arr2=new ArrayList<Integer>();
    ArrayList<Integer> arr3=new ArrayList<Integer>();

    public ArrayModel(ArrayList<Integer>arr1, ArrayList<Integer>arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.arr3 = arr3;
    }

    public void arrayMerge(){

        for(int i=0;i< this.arr1.size();i++){
            this.arr3.add(this.arr1.get(i));
        }
        for(int i=0;i< this.arr2.size();i++){
            this.arr3.add(this.arr2.get(i));
        }
    }

    @Override
    public String toString() {
        return "ArrayModel{" +
                "arr1=" + arr1 +
                ", arr2=" + arr2 +
                ", arr3=" + arr3 +
                '}';
    }
}
