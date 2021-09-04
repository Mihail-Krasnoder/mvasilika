package homework5;

public class Animal {
    int id;
    int age;
    double weight;
    String color;
    Animal(int id,int age, double weight, String color){
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public void voice(){
        System.out.println("Voice!");
    }
    public String takeHome(){
        return "* Leads his blind master home *";
    }
}
