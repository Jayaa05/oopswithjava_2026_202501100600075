public interface Rentable {
    double calculateRent(int days);

}

class Car implements Rentable {

   
    static final double TAX_RATE = 0.05;
    static int totalVehiclesRented = 0;
    public double calculateRent(int days) {
        double rent = 1500 * days;
        totalVehiclesRented++;
        return rent;
    }
}

class Bike implements Rentable {
    static int totalVehiclesRented = 0;
    public double calculateRent(int days) {
        double rent = 500 * days;
        totalVehiclesRented++;
        return rent;
    }
}

public class Rentable
{
    public static void main(String[] args) {

        Rentable car = new Car();
        Rentable bike = new Bike();

        double carRent = car.calculateRent(3);
        double bikeRent = bike.calculateRent(2);

        System.out.println("Car rent incl. tax: " + (carRent + carRent * Car.TAX_RATE));
        System.out.println("Bike rent incl. tax: " + (bikeRent + bikeRent * Bike.TAX_RATE));
        System.out.println("Total vehicles rented: " + Car.totalVehiclesRented);
    }
} {
    
}
