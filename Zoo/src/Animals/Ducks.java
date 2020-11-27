package Animals;

import Food.Food;

public class Ducks extends Herbivorous {



    @Override
    public void Fly() {
        System.out.println("Утка летает!");
    }

    @Override
    public void Swim() {
        System.out.println("Утка плавает!");
    }

    @Override
    public void Run() {
        System.out.println("Утка бегает!");
    }

    @Override
    public String Voice() {
        return "Кря-кря!";
    }



}
