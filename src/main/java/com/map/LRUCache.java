package com.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private int capacity;
    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer>  cashe1= new LRUCache<>(3);
        cashe1.put("shweta",1);
        cashe1.put("Ram",2);
        cashe1.put("Sita",3);
        cashe1.put("Kajol",4);
        System.out.println(cashe1);


    }
}
