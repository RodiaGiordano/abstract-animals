package abstract_animals.animals;

public class Main {
    public static void main(String[] args){

        try{

            Animal[] animals = {new Dog("Zeus"),new Bird("Picchiarello"), new Dolphin("Flipper"), new Eagle("Olympia"), new Sloth("Bradipo"), new Snake("Arboc")};

            for(int i = 0; i < animals.length; i++){
                Animal.runAction(animals[i]);
            }
        } catch(RuntimeException | NoSuchMethodException e){
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
