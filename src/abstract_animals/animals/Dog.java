package abstract_animals.animals;

public class Dog extends Animal implements Swim{

    private String name;

    Dog(String name) throws IllegalArgumentException{
        this.name = checkName(name);
    }

    public void animalCall(){
        System.out.println("Bau!");
    };

    public void eats(){
        System.out.println("Kibble");
    };

    public String getName(){
        return "Il nome del cane è: ".concat(name);
    }

    @Override
    public void swim() {
        System.out.println(name.concat(" sta nuotando!"));
    }
}
