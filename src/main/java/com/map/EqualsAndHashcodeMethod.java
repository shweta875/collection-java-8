package com.map;

import java.util.HashMap;
import java.util.Objects;

public class EqualsAndHashcodeMethod {
    public static void main(String[] args) {
        HashMap<Person,String> map=new HashMap<>();
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("BOB", 2);
        Person p3 = new Person("Alice", 1);
        map.put(p1,"Engineer");
        map.put(p2,"Designer");
        map.put(p3,"Manager");
        System.out.println(map);
    }
}


class Person {
    private String name;
    private int id;
    public Person(String name,int id){
         this.name=name;
         this.id=id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
