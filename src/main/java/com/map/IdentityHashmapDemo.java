package com.map;

import java.util.IdentityHashMap;

public class IdentityHashmapDemo {
    public static void main(String[] args) {
        String key1=new String("key");
        String key2=new String("key");
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put(key1,1);
        map.put(key2,2);
        System.out.println(map);

    }
}
