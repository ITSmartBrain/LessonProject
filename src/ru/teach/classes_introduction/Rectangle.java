package ru.teach.classes_introduction;

/**
 * ОПисывает фигуру прямоугольника
 */
public class Rectangle {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSqure(){
        return a*b;
    }

    public int getPerimetr(){
        return 2*(a+b);
    }

    public void print(){
        System.out.println("a = "+a+" b = "+b);
    }
}
