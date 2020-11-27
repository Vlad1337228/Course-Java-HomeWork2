package Animals;


import Food.Food;
import Food.Meat;
public abstract class Carnivorous extends  Animal { //плотоядные наследующий

    @Override
    public void Eat(Food food)
    {
        if(food instanceof Meat)
        {
            System.out.println(" Этим можно накормить животное");
        }
        else
        {
            System.out.println(" Этим нельзя накормить животное");
        }
    }
}
