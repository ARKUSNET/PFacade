package pattern_facade.home_cinema_component;

/**
 * Created by a.kuspakov on 10.10.2016.
 */
public class TheaterLights {
    public void dim(int i) {
        System.out.println("Theater Ceiling Lights dimming to " + i + "%");
    }

    public void on() {
        System.out.println("Theater Ceiling Lights on");
    }
}
