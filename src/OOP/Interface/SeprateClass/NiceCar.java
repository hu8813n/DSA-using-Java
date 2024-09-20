package OOP.Interface.SeprateClass;

import OOP.Interface.Engine;
import OOP.Interface.Media;
import OOP.Interface.SeprateClass.CDplayer;
import OOP.Interface.SeprateClass.ElectricEngine;
import OOP.Interface.SeprateClass.PowerEngine;

public class NiceCar {
    private Engine engine;
    private Media player = new CDplayer();
    public NiceCar(){
        engine = new PowerEngine();
    }
    public NiceCar(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
