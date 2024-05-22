package abstract_animals.animals;

public class Snake extends Animal{

    private String name;

    Snake(String name){
        this.name = checkName(name);
    }

    @Override
    public void animalCall() {
        System.out.println("sssssss");
    }

    @Override
    public void eats() {
        System.out.println("rabbit");
    }

    public String getName(){
        return name;
    }
}
