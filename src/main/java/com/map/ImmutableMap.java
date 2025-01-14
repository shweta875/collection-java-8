package com.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("shweta",1);
        hashMap.put("sonam",2);

        Map<String, Integer> immutableMap1 = Collections.unmodifiableMap(hashMap);
        //immutableMap1.put("shweta",1);   java.lang.UnsupportedOperationException


        Map<String, Integer> immutableMap2 = Map.of("SHweta", 1, "Sonam", 2);
        //max capacity 10 entries

        Map<String, Integer> kvMap = Map.ofEntries(Map.entry("shweta",1),Map.entry("kanha",2),Map.entry("Ramesh",3),Map.entry("hari",5));
        //no max capacity

    }
}
