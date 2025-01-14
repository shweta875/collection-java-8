package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

        // Ex. 1 ConcurrentModificationException
//        List<String> shoppingList=new ArrayList<>();
//        shoppingList.add("Milk");
//        shoppingList.add("Eggs");
//        shoppingList.add("Bread");
//        System.out.println("Initial Shopping List: "+ shoppingList);
//
//        for(String item:shoppingList){
//            System.out.println(item);
//            //Try to modify the list while reading
//            if(item.equals("Eggs")){
//                shoppingList.add("Butter");
//                System.out.println("Added Butter while reading");
//            }
//        }
//        System.out.println("Updated Shopping List: "+ shoppingList);

        List<String> sharedList =new CopyOnWriteArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");

        Thread readerThread =new Thread(()->{
            try{
                while(true){
                    for(String item : sharedList){
                        System.out.println("Reading item:"+ item);
                        Thread.sleep(100);
                    }
                }

            }catch(Exception e){
                System.out.println("Exception in reader thread :" +e);
            }
        });

        Thread writerThread =new Thread(()->{
            try{
               Thread.sleep(500);
               sharedList.add("Item4");
                System.out.println("Added item to the List");

                Thread.sleep(500);
                sharedList.remove("Item1");
                System.out.println("Removed Item1 From the list.");

            }catch(Exception e){
                System.out.println("Exception in reader thread :" +e);
            }
        });
        readerThread.start();
        writerThread.start();


    }
}
