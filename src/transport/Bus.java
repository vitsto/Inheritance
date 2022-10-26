package transport;

import fuel.Diesel;
import fuel.Fuel;
import fuel.Petrol;

public class Bus extends Transport{

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    public void refill(Fuel fuel) {
        if (fuel instanceof Diesel || fuel instanceof Petrol) {
            this.fuel = fuel;
        } else {
            System.out.println("Неподходящий вид топлива");
        }
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getName() + "]" + super.toString();
    }
}
