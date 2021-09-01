package homework4;

public class Car {
    int volume;
    int remainder;
    int fuelConsumption;
    int n;
    int refuel;
    int price;
    Car(int volume, int remainder, int fuelConsumption, int n){
        this.volume = volume;
        this.remainder = remainder;
        this.fuelConsumption= fuelConsumption;
        this.n = n;
    }

    public void refillingTheCar(int price){
        if (remainder<volume){
            System.out.println("Refilling the car...");
            refuel=volume-remainder;
            price*=refuel;
        }
        System.out.println("The fuel tank is " + refuel + " liters full. " + " Price: " + price);
    }

    public double fuelRemainingInTheTank(int n){
       return (this.fuelConsumption/100.0)*n;


    }
    public int refueling(int refuel){
        return volume - refuel;
    }
    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }

}
