package Animals;

import Food.Food;

public class Horce extends Herbivorous  {
    @Override
    public void Run() {
        System.out.println("Лошадь бегает!");
    }

    @Override
    public String Voice() {
        return "ИГО-ГО";
    }
}
