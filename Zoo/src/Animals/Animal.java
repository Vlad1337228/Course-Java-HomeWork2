package Animals;

import Food.Food;

public abstract class Animal   implements Flying , Swimmable , Running , Speaking {   // класс наследующий

    private int weight; // вес животного

    public void setWeight(int value)
    {
        weight=value;
    }
    public int setWeight()
    {
       return weight;
    }

    public void Eat(Food food) {

    }

    @Override
    public void Fly() {

    }

    @Override
    public void Swim() {
        System.out.println("sdfgdf");
    }

    @Override
    public void Run() {

    }

    @Override
    public String Voice() {
        return "Животное не разговаривает";
    }
}
