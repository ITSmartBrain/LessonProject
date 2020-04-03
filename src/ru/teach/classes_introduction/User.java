package ru.teach.classes_introduction;

public class User {
    String name;
    int age;


    public User(String nameParam, int ageParam){
        System.out.println("hello constructor");
        name = nameParam;
        age = ageParam;
    }

    public void init(String nameParam, int ageParam){
        name = nameParam;
        age = ageParam;
    }

    public void print(){
        System.out.println(name+" "+age);
    }

}
