package abstract_animals.animals;

public class Main {
    public static void main(String[] args){

        try{

            Animal[] animals = {new Dog("Zeus"),new Bird("Picchiarello"), new Dolphin("Flipper"), new Eagle("Olympia")};
            for(int i = 0; i < animals.length; i++){
                Animal.runAction(animals[i]);
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
