package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList2Demo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Shweta");
        list.add("Kamal");
        list.add("Radha");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }

        for(String s: list){
            System.out.println(s);
        }

        list.add(1,"Ram");
        System.out.println("---------set-------------");
        list.set(2,"KKKKK");
        System.out.println(list);
        System.out.println("-----------get-----------");
        String s = list.get(1);
        System.out.println(s);
        System.out.println("-----------remove-------");
     list.remove(1);
        System.out.println(list);
        System.out.println("----------Sorting List-----------");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("----------iterating List-----------");
        list.forEach(l-> System.out.println(l));

        System.out.println(list.isEmpty());
        System.out.println(list.size());



    }

}
