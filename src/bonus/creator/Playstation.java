package bonus.creator;

public class Playstation implements PlaybackDevice {
    @Override
    public void play() {
        System.out.println("sono una Playstation e sono in modalità play");
    }
    @Override
    public void stop(){
        System.out.println("sono una Playstation e sono in modalità stop");
    }
}
