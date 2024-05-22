package abstract_animals.animals;

public class Eagle extends Animal implements Fly{
    String name;

    Eagle(String name) throws IllegalArgumentException{
        this.name = checkName(name);
    }

    public void animalCall(){
        System.out.println("verso aquila");
    };

    public void eats(){
        System.out.println("rabbit");
    }

    @Override
    public void fly() {
        System.out.println(name.concat(" sta volando!"));
    }

    public String getName(){
        return "Il nome dell'acquila è: ".concat(name);
    }
}
