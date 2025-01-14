package com.map;

import com.sun.security.jgss.GSSUtil;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>((a,b)->b-a);
        sortedMap.put(91,"shweta");
        sortedMap.put(99,"abc");
        sortedMap.put(88,"bcd");
        sortedMap.put(77,"kal");
        System.out.println(sortedMap);

        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap(91)); //Exclusive
        System.out.println(sortedMap.tailMap(91));//Inclusive

    }
}
