package com.javarush.task.pro.task11.task1107;

/* 
Двигатель — сердце автомобиля
*/

public class Car {
    Engine engine =new Engine();
    public class Engine{
        private boolean isRunning;
        public void start(){
            isRunning = true;
            System.out.println("Двигатель запущен!");
        }
        public void stop(){
            isRunning =false;
            System.out.println("Двигатель остановлен!");
        }

    }

}
