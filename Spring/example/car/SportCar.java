package org.example.car;

import org.example.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SportCar implements Car {

    @Autowired
    @Qualifier("sportEngine")
    private Engine engine;

    @Value("${car.colour:no choice}")
    private String colour;


    public SportCar(){}
//    public SportCar(@Qualifier("sportEngine") Engine engine) {
//        this.engine = engine;
//    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String showEngineHP() {
        return "hp: " + engine.getHp();
    }

    @Override
    public void showInfo() {
        System.out.println("Colour: " +colour);
    }


}
// without DI
//    public Car() {
//        engine = new Engine();
//    }


    //with DI
//    public Car(Engine engine) {
//        this.engine = engine;
//    }


