package homework5;

public class GuideDog extends Training{

    GuideDog(int id, int age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated, isTrained);
    }

    public static void main(String[] args) {
        GuideDog guideDog = new GuideDog(5847, 13, 30.350, "Blake-white",
                "Roma", true, true );
        guideDog.voice();
    }
    @Override
    public void voice() {
        System.out.println("Hello, my name is " + name + "." + " Woof." + takeHome());
    }
}
