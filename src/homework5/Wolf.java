package homework5;

public class Wolf extends WildAnimal{

    Wolf(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public static void main(String[] args) {
        Wolf wolf = new Wolf(365,10, 15.432, "Grey", true);
        wolf.voice();
    }
    @Override
    public void voice() {
        System.out.println("Hello, I am a wild animal and I am angry.");
    }
}
