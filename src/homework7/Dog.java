package homework7;

public class Dog extends Pet implements Voice{

    Dog(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public static void main(String[] args) {
        Dog dog = new Dog(45543,7, 25.450, "Black", "Vasya", true);
        dog.voice();
    }
    public void voice() {
        System.out.println(Voice.voice() + "my name is " + name + "." + " Meow.");
    }
}
