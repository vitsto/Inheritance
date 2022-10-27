package transport;

import fuel.Diesel;
import fuel.Fuel;
import utilits.Util;

import java.time.LocalTime;

public class Train extends Transport {
    private double price;
    private LocalTime time;
    private String sourceStation;
    private String destinationStation;
    private int countOfCarriages;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,
                 double price, LocalTime time, String sourceStation, String destinationStation, int countOfCarriages) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.price = Math.max(price, 100);
        this.time = time;
        this.sourceStation = Util.isDefine(sourceStation) ? sourceStation : "undefined";
        this.destinationStation = Util.isDefine(destinationStation) ? destinationStation : "undefined";
        this.countOfCarriages = Math.max(countOfCarriages, 1);
    }

    public void setPrice(double price) {
        this.price = Math.max(price, 100);
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = Util.isDefine(sourceStation) ? sourceStation : "undefined";
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = Util.isDefine(destinationStation) ? destinationStation : "undefined";
    }

    public void setCountOfCarriages(int countOfCarriages) {
        this.countOfCarriages = Math.max(countOfCarriages, 1);
    }

    public double getPrice() {
        return price;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public int getCountOfCarriages() {
        return countOfCarriages;
    }

    @Override
    public void refill(Fuel fuel) {
        if (fuel instanceof Diesel) {
            this.setFuel(fuel);
        } else {
            System.out.println("Неподходящий вид топлива");
        }
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getName() + "]" + super.toString() + ", станция отбытия: " + getSourceStation()
                + ", станция прибытия: " + getDestinationStation()
                + ", время поездки: " + getTime() + ", количество вагонов: " + getCountOfCarriages()
                + ", стоимость: " + getPrice();
    }
}
