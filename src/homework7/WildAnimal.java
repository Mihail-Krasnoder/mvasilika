package homework7;

public abstract class WildAnimal extends Animal {
    boolean isPredator;
    WildAnimal(int id,int age, double weight, String color, boolean isPredator){
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }
}
