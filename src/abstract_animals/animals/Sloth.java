package abstract_animals.animals;

public class Sloth extends Animal {

    private String name;

    Sloth(String name){
        this.name = checkName(name);
    }

    @Override
    public void animalCall() {
        System.out.println("verso bradipo");
    }

    @Override
    public void eats() {
        System.out.println("leaves");
    }

    public String getName(){
        return name;
    }
}
