package homework7;

public class GuideDog extends Training {

    GuideDog(int id, int age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated, isTrained);
    }

    public static void main(String[] args) {
        GuideDog guideDog = new GuideDog(5847, 13, 30.350, "Blake-white",
                "Roma", true, true );
        guideDog.voice();
    }
    public void voice() {
        System.out.println(Voice.voice() + "my name is " + name + "." + " Woof." + TakeHome.takeHome());
    }
}
