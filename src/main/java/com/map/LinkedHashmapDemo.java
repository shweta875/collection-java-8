package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmapDemo {

    public static void main(String[] args) {
        //maintains insertion order
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
        //accessOrder : false
        linkedHashMap.put("shweta",1);
        linkedHashMap.put("Radha",2);


        HashMap<String, Integer> map = new HashMap<>();
        map.put("Neha",2);
        map.put("Kajol",3);
        LinkedHashMap<String, Integer> linkedHashMap2 = new LinkedHashMap<>(map);

        Set<Map.Entry<String, Integer>> entries = linkedHashMap2.entrySet();
        for(Map.Entry<String, Integer> i: entries){
            System.out.println(i.getKey()+" : "+i.getValue());
        }


        // some map methods
        Integer shweta = map.getOrDefault("Shweta", 0);
        System.out.println(shweta);

        map.putIfAbsent("Shweta",1);
        System.out.println(map);




    }



}
