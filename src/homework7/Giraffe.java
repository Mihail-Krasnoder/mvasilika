package homework7;

public class Giraffe extends WildAnimal implements Voice{

    Giraffe(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public static void main(String[] args) {
        Giraffe giraffe = new Giraffe(3865, 6, 203.956, "Ginder", false);
        giraffe.voice();
    }
    public void voice() {
        System.out.printf(Voice.voice() + "I am a wild animal and I am angry.");
    }
}
