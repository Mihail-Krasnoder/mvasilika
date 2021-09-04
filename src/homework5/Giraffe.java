package homework5;

public class Giraffe extends WildAnimal{

    Giraffe(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public static void main(String[] args) {
        Giraffe giraffe = new Giraffe(3865, 6, 203.956, "Ginder", false);
        giraffe.voice();
    }
    @Override
    public void voice() {
        System.out.println("Hello, I am a wild animal.");
    }
}
