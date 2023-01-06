package org.example.car;

import org.example.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class OffroadCar implements Car{

    @Autowired
    @Qualifier("offroadEngine")
    private Engine engine;

    @Autowired
    private Environment environment;

    public OffroadCar() {

    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String showEngineHP() {
        return "hp: " + engine.getHp();
    }

    @Override
    public void showInfo() {
        System.out.println("Transmission: " + environment.getProperty("car.transmission"));
    }
}