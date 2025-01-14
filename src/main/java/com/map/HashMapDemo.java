package com.map;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Ankit");
        map.put(2,"Raghav");
        map.put(3,"Chaitali");
        System.out.println(map);
        String s = map.get(3);
        String s1 = map.get(9);
        System.out.println(s1);   //null

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Raghav"));

        Set<Integer> keys = map.keySet();
        for(int key:keys){
            System.out.println(map.get(key));
        }

        System.out.println("----------List of Values----------");
        Collection<String> values = map.values();
        ArrayList<String> list = new ArrayList<>(values);
        System.out.println(list);

        System.out.println("---------Entryset-----------");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> e:entries){
            System.out.println(e.getKey()+" : "+e.getValue());
        }




    }
}
