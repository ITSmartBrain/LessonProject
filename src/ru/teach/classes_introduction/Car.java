package ru.teach.classes_introduction;

/**
 * Описать класс автомобиля
 */
public class Car {
    String name;
    int maxSpeed;
    String color;

//    public Car(String nameParam, int maxSpeedParam, String colorParam) {
//        name = nameParam;
//        maxSpeed = maxSpeedParam;
//        color = colorParam;
//    }

    //this - ссылка объекта на самого себя
    //нужна чтобы решить конфликт приоритета локальных переменных перед глобальными
    public Car(String name, int maxSpeed, String color) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void startMove(){
        System.out.println("Автомобиль "+name+" начал движение");
    }

    public void stopMove(){
        System.out.println("Автомобиль "+name+" остановил движение");
    }


}
