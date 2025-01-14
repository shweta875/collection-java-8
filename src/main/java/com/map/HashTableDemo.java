package com.map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    //Hashtable is synchronised
    //no null key or value
    //legacy class
    //slower than map
    //implements Map
    //all methods are synchronised
    //only Linkedlist in case of collision
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        Hashtable<Integer, String> hashTable = new Hashtable<>();
        Thread t1=  new Thread(()->{
            for(int i=0;i<1000;i++){
                hashTable.put(i,"thread1");
                hashMap.put(i,"thread1");
            }
        });
       Thread t2= new Thread(()->{
            for(int i=1000;i<2000;i++){
                hashTable.put(i,"thread2");
                hashMap.put(i,"thread2");
            }
        });
       t1.start();
       t2.start();

        try {
            t1.join();      // The join() method ensures the main thread waits
                             // for both t1 and t2 to finish before executing System.out.println(hashMap)
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(hashMap.size());
        System.out.println(hashTable.size());

    }
}
