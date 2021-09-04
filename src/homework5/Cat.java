package homework5;

public class Cat extends Pet{

    Cat(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public static void main(String[] args) {
        Cat cat = new Cat(1457, 15, 7.267, "White", "Barsik", true);
        cat.voice();
    }
    @Override
    public void voice() {
        System.out.println("Hello, my name is " + name + "." + " Meow.");
    }
}
