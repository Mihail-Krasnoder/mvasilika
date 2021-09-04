package homework5;

public class Lion extends WildAnimal{

    Lion(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public static void main(String[] args) {
        Lion lion = new Lion(987, 12, 156.184, "Ginger", true);
        lion.voice();
    }
    @Override
    public void voice() {
        System.out.println("Hello, I am a wild animal and I am angry.");
    }
}
