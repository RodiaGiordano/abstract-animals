package bonus.creator;

public class Dvd implements PlaybackDevice{

    @Override
    public void play() {
        System.out.println("sono un lettore dvd e sono in modalità play");
    }
    @Override
    public void stop(){
        System.out.println("sono un lettore dvd e sono in modalità stop");
    }
}
