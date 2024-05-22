package bonus.creator;

public class Creator {

    // Vogliamo realizzare una classe che si occupi di istanziare un oggetto che può essere un lettore dvd o playstation.

    static PlaybackDevice create(String chosenDevice) throws IllegalArgumentException{

        PlaybackDevice device;

        switch(chosenDevice){
            case "dvd":
                device = new Dvd();
                break;
            case "playstation":
                device = new Playstation();
                break;
            default:  throw new IllegalArgumentException("Posso creare solo dvd o playstation");
        }
        return device;
    }

}
