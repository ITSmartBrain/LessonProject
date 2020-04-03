package ru.teach.classes_introduction;

public class Main {

    public static void main(String[] args) {
        //было
//        User user = new User();
        //user.init("Ivan", 20);
//        user.name = "Ivan";
//        user.age = 20;

        //стало:
//        User user = new User("Ivan", 20);
//        System.out.println(user.name+" "+user.age);

        //Создать базу данных с именами и возрастами пользователей
//        String[] arrNames = new String[3];
//        arrNames[0] = "Ivan";
//        arrNames[1] = "Semen";
//        arrNames[2] = "Petr";
//
//        int[] arrAge = new int[3];
//        arrAge[0] = 20;
//        arrAge[1] = 30;
//        arrAge[2] = 40;
//
//
//        System.out.println(arrNames[0]+" "+arrAge[0]+" "+.... );
//        System.out.println(arrNames[0]+" "+arrAge[0]+" "+.... );


        //массив
//        User[] arr = new User[3];
//        arr[0] = new User("Ivan", 20);
//        arr[1] = new User("Petr", 30);
//        arr[2] = new User("Semen", 40);
//
//        arr[0].print();
//        arr[1].print();
//        arr[2].print();
//
//        System.out.println(arr[0].name);


        //Глоабльные и локальные переменные в классе Calculator
//        Calculator calculator = new Calculator();
//        calculator.sum(10, 20);
//        calculator.printResult();
//
//        calculator.minus(10, 5);
//        calculator.printResult();
//
//
//        calculator.result = 20;
//        calculator.test(10);


        //Автомобиль
//        Car car1 = new Car("bmw", 10, "Белый");
//        Car car2 = new Car("lada", 20, "Черный");
//        Car car3 = new Car("audi", 30, "Синий");
//
//        car1.startMove();
//        car1.stopMove();
//
//        car2.startMove();
//        car2.stopMove();


        //Создать 5 прямоугольников и найти у всех площадь и периметр
        Rectangle[] rectangles = new Rectangle[5];
        for (int i = 0; i < 5; i++) {
            rectangles[i] = new Rectangle(i+2, i*2+3);
            rectangles[i].print();
            int square = rectangles[i].getSqure();
            int perimetr = rectangles[i].getPerimetr();
            System.out.println("Площадь: "+square+" Периметр: "+perimetr);
        }






    }


}
