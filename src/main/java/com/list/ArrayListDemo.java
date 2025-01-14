package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(80);

//        System.out.println(list.get(0));
//        System.out.println(list.size());
//
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//
//        for (int x:list){
//            System.out.println(x);
//        }
//
//        System.out.println(list.contains(5));
//        System.out.println(list.contains(4));

//        System.out.println(list.remove(2));   // returns removed element
//        for (int x:list){
//            System.out.print(x+" ");
//        }

//        list.add(2,50);
//        for(int x:list){
//            System.out.print(x+" ");
//        }

//        list.set(2,33); //replace elem at index 2
//        for (int x:list){
//            System.out.println(x);
//        }

//        System.out.println(list);
//        List<String> list1 = Arrays.asList("shweta", "ram", "swaraj", "Vrunda");

        List<Integer> list1 = Arrays.asList(1, 56, 78, 97, 4, 6, 7);
        list1.sort((a,b)->a-b);
        System.out.println(list1);
        list1.sort((a,b)->b-a);
        System.out.println(list1);

        List<String> list2 = Arrays.asList("shweta", "Kamaladevi", "raj");
        list2.sort((a,b)->a.length()-b.length());
        System.out.println(list2);


      List<Student> listOfStudent=new ArrayList<>();
      listOfStudent.add(new Student("Shweta",12));
        listOfStudent.add(new Student("Manda",45));
        listOfStudent.add(new Student("Shrivalli",48));
        listOfStudent.add(new Student("Prathami",99));
        listOfStudent.add(new Student("Daksh",133));



        Comparator<Student> comparing = Comparator.comparing(Student::getScore);
        listOfStudent.sort(comparing);
        System.out.println(listOfStudent);

        Comparator<Student> comparing1 = Comparator.comparing(Student::getScore).reversed();
        listOfStudent.sort(comparing1);
        System.out.println(listOfStudent);


        Comparator<Student> comparing2 = Comparator.comparing(Student::getScore).thenComparing(Student::getName);
        listOfStudent.sort(comparing2);
        System.out.println(listOfStudent);


    }
}
