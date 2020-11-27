package Animals;

import Food.Food;
import Food.Grass;
public abstract class Herbivorous extends Animal  {  // травоядные

    @Override
    public void Eat(Food food) {
        if(food instanceof Grass)
        {
            System.out.println(" Этим можно накормить животное");
        }
        else
        {
            System.out.println(" Этим нельзя накормить животное");
        }

    }
}
