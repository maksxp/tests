package test1;

import java.util.ArrayList;

public class Param <P>{
    P value;
    Param (P value){
        this.value=value;
    }
    public static <T> T getZero (ArrayList <T> s){
        return s.get(0);
    }

    public static void main(String[] args) {
        ArrayList <String> al = new ArrayList<>();
        al.add("ww");
        String s=getZero(al);
        ArrayList <Integer> alI = new ArrayList<>();
        alI.add(55);
        Integer z=getZero(alI);
        System.out.println(z);

    }
}

class Info {}

class Parent {
    public void abc (Param <String> param){

    }
}

class Child extends Parent {
    public void abc (Param<String> param){

    }
}