package abstract_animals.animals;

public class Bird extends Animal implements Fly{
    String name;

    Bird(String name) throws IllegalArgumentException{
        this.name = checkName(name);
    }

    public void animalCall(){
        System.out.println("Pio-pio!");
    };

    public void eats(){
        System.out.println("worms");
    }

    @Override
    public void fly() {
        System.out.println(name.concat(" sta volando!"));
    }

    public String getName(){
        return "Il nome del passerotto è: ".concat(name);
    }
}
