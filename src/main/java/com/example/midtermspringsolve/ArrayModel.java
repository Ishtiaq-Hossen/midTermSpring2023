package com.example.midtermspringsolve;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayModel {
    ArrayList<Integer> arr1=new ArrayList<Integer>();;
    ArrayList<Integer> arr2=new ArrayList<Integer>();
    ArrayList<Integer> arr3=new ArrayList<Integer>();

    public ArrayModel(ArrayList<Integer>arr1, ArrayList<Integer>arr2, ArrayList<Integer>arr3) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.arr3 = arr3;
    }

    public void arrayMerge(ArrayList<Integer>arr1, ArrayList<Integer>arr2){

        for(int i=0;i< arr1.size();i++){
            arr3.add(arr1.get(i));
        }
        for(int i=0;i< arr2.size();i++){
            arr3.add(arr2.get(i));
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
