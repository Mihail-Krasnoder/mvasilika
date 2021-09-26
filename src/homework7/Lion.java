package homework7;

public class Lion extends WildAnimal implements Voice{

    Lion(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public static void main(String[] args) {
        Lion lion = new Lion(987, 12, 156.184, "Ginger", true);
        lion.voice();
    }
    public void voice() {
        System.out.printf(Voice.voice() + "I am a wild animal and I am angry.");
    }
}
