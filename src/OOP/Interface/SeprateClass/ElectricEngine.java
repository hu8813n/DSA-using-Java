package OOP.Interface.SeprateClass;

import OOP.Interface.Engine;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("ELectric Engine stops");

    }

    @Override
    public void acc() {
        System.out.println("Electric Engine accelerates");
    }
}

