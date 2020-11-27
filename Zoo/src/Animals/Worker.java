package Animals;
import java.lang.reflect.Method;
import Food.Food;

public class Worker extends Carnivorous { // работник
    public void Feed(Animal animal, Food food)
    {
        animal.Eat(food);
    }
    public void Voice(Animal animal)
    {

        boolean hasMethod = false;
        Method[] methods = animal.getClass().getMethods();
        for (Method m : methods) {
            if (m.getName().equals("Voice")) {
                hasMethod = true;
                break;
            }
        }

        if(hasMethod) {
            System.out.println(animal.Voice());
        } else
            System.out.println("Животное не разговаривает");

    }
}
