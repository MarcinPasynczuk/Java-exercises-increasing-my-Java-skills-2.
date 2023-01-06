package org.example;

import org.example.car.Car;
import org.example.car.OffroadCar;
import org.example.car.SportCar;
import org.example.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Car sportCar = ctx.getBean(SportCar.class);
        Car offroadCar = ctx.getBean(OffroadCar.class);


        sportCar.showInfo();
        offroadCar.showInfo();



        ((AnnotationConfigApplicationContext)ctx).close();

    }
}