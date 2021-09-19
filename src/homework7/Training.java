package homework7;

public class Training extends Pet {
    boolean isTrained;
    Training(int id, int age, double weight, String color, String name, boolean isVaccinated, boolean isTrained){
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }
}
