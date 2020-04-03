package ru.teach.classes_introduction;


public class Calculator {
    int result; //глобальная переменная (поле)
    //глобальная значит, что она доступна в любой точке класса, где она создана (в любых методах)

    //a,b - локальные переменные (параметрами) доступны только внутри конструкции (метода), где они создаты. За пределами их уже не существует
    //параметров а и b За пределами метода sum уже не существует

    public void test(int result){
        System.out.println(this.result);
    }

    public void sum(int a, int b){
        int z = 0; //глобальная относительно метода
        if(true){
            int m = 0; //локальная
            System.out.println(z);
        }else{
            //System.out.println(m); //так как m локальная относительно условия if, в else она уже не видна
            System.out.println(z);
        }
        result = a+b;
    }

    public void minus(int a, int b){

        result = a - b;
    }

    public void printResult(){

        System.out.println(result);
    }
}
