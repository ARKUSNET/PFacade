package pattern_facade.home_cinema_component;

/**
 * Created by a.kuspakov on 10.10.2016.
 */
public class DvdPlayer {
    public void on() {
        System.out.println("Top-O-Line DVD Player on");
    }

    public void play(String movie) {
        System.out.println("Top-O-Line DVD Player playing " + movie);
    }

    public void stop(String movie) {
        System.out.println("Top-O-Line DVD Player stopped " + movie);
    }

    public void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }

    public void off() {
        System.out.println("Top-O-Line DVD Player off");
    }
}
