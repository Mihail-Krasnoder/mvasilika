package homework4;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car(70,15,20, 475);
        System.out.println("Car preparation for departure from Odessa to Kiev. Fuel in the tank: " + car.remainder);
        car.refillingTheCar(30);
        System.out.println("We make a stop at a gas station in Krivoy Ozero.");
        car.setRemainder(30);
        System.out.println("Fuel needs to be refueled: " + car.fuelRemainingInTheTank(200));
        System.out.println("Remaining fuel: " + car.refueling(40));
        car.refillingTheCar(34);
        System.out.println("We make a stop at a gas station in Zhashkov. ");
        car.setRemainder(40);
        System.out.println("Fuel needs to be refueled: " + car.fuelRemainingInTheTank(150));
        System.out.println("Remaining fuel: " + car.refueling(30));
        car.refillingTheCar(28);
        System.out.println("Arrived in Kiev.");
        System.out.println("Remaining fuel at destination: " + car.fuelRemainingInTheTank(125));
        System.out.println(" The cost of the entire trip: 3850 grn. ");
    }
}
