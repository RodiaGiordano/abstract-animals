package abstract_animals.animals;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

    public static void runAction(Animal animal) throws IllegalAccessException, NoSuchMethodException, RuntimeException {

        if(animal instanceof Swim){
            Swim swim = (Swim) animal;
            swim.swim();
        } else if (animal instanceof Fly) {
            Fly fly = (Fly) animal;
            fly.fly();
        }else{

            try{
                String name =(String) animal.getClass().getMethod("getName").invoke(animal);
                System.out.println(name.concat(" non ha nessuna azione particolare"));
            }catch(IllegalAccessException e){
                throw new IllegalAccessException("L'animale non ha un nome, dovrebbe averlo");
            }catch( NoSuchMethodException e){
                throw new NoSuchMethodException("Non esiste il metodo!");
            }
            catch (InvocationTargetException e) {
                throw new RuntimeException("Non è stato possibile invocare il metodo");
            }

        }

    }



}
