package pattern_facade;

import pattern_facade.home_cinema_component.*;

/**
 * Created by a.kuspakov on 10.10.2016.
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        //Create instance element

        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd,
                                                              projector, screen, lights, popper);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie("Raiders of the Lost Ark");
    }
}
