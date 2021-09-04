package homework5;

public class Crocodile extends WildAnimal{

    Crocodile(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public static void main(String[] args) {
        Crocodile crocodile = new Crocodile(134, 35, 135.500, "Green", true);
        crocodile.voice();
    }
    @Override
    public void voice() {
        System.out.println("Hello, I am a wild animal and I am angry.");
    }
}
