package com.map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeekHashmapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        loadCashe(imageCache);
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println(imageCache);
    }
    private static void loadCashe(Map<String,Image> cashe){
          cashe.put(new String("img1"),new Image("img 1"));
          cashe.put(new String("img2"),new Image("img 2"));

    }

    private static void simulateApplicationRunning(){
        try{
            System.out.println("Application Running...........");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

class Image{
 private String image;

    public Image(String image) {
        this.image = image;
    }
}


