package abstract_animals.animals;


public abstract class Animal {


    public abstract void animalCall();

    public abstract void eats();

    protected void sleep(){
        System.out.println("Zzzzzz");
    }

    protected String checkName(String name) throws IllegalArgumentException{
        String classAnimalName = getClass().getSimpleName();
        String animalName;

        switch(classAnimalName){
            case "Dog":
                animalName = "cane";
                break;
            case "Bird":
                animalName = "passerotto";
                break;
            case "Dolphin":
                animalName = "delfino";
                break;
            case "Eagle":
                animalName = "aquila";
                break;
            default: animalName = "";
        }

        if( name == null || name.length() <= 0) throw new IllegalArgumentException("Il" + animalName + " dovrebbe avere un nome");
        return name;
    }

    public static void runAction(Animal animal){

        if(animal instanceof Swim){
            Swim swim = (Swim) animal;
            swim.swim();
        } else if (animal instanceof Fly) {
            Fly fly = (Fly) animal;
            fly.fly();
        }

    }


}
