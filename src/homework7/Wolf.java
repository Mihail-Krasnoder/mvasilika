package homework7;

public class Wolf extends WildAnimal implements Voice{

    Wolf(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public static void main(String[] args) {
        Wolf wolf = new Wolf(365,10, 15.432, "Grey", true);
        wolf.voice();
    }

    public void voice() {
        System.out.printf(Voice.voice() + "I am a wild animal and I am angry.");
   }
}
