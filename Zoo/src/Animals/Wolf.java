package Animals;

public class Wolf extends Carnivorous {
    @Override
    public void Run() {
        System.out.println("Волк бегает!");
    }

    @Override
    public String Voice() {
        return "АУУУУУ";
    }
}
