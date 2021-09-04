package homework5;

public class Dog extends Pet{

    Dog(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public static void main(String[] args) {
        Dog dog = new Dog(45543,7, 25.450, "Black", "Vasya", true);
        dog.voice();
    }
    @Override
    public void voice() {
        System.out.println("Hello, my name is " + name + "." + " Woof.");
    }
}
