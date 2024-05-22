package bonus.creator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci dvd o playstation");
        String userChoice = scanner.nextLine();

        try{
            PlaybackDevice device = Creator.create(userChoice);
            device.play();
            device.stop();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally{
            scanner.close();
        }
    }
}
