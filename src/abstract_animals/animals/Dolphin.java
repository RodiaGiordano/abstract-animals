package abstract_animals.animals;

public class Dolphin extends Animal implements Swim{
    String name;

    Dolphin(String name) throws IllegalArgumentException{
        this.name = checkName(name);
    }


    public void animalCall() {
        System.out.println("splash");
    }
    public void eats(){
        System.out.println("fish");
    }

    @Override
    public void swim() {
        System.out.println(name.concat(" sta nuotando!"));
    }

    public String getName(){
        return "Il nome del delfino è: ".concat(name);
    }
}
