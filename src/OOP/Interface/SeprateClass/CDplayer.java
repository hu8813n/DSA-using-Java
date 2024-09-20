package OOP.Interface.SeprateClass;

import OOP.Interface.Media;

public class CDplayer implements Media {
    @Override
    public void start() {
        System.out.println("Music starting");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}