package homework5;

public class Fish extends Pet{
    Fish(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public static void main(String[] args) {
        Fish fish = new Fish(1456,1, 0.150, "Red", "Anzhella", false );
        fish.voice();
    }
    @Override
    public void voice() {
        System.out.println("....");
    }
}
